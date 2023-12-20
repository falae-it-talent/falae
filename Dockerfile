FROM ruby:3.0.6

RUN apt-get update -qq && apt-get install -y \
    build-essential \
    libpq-dev \
    netcat-traditional \
    default-libmysqlclient-dev \
    ca-certificates \
    curl \
    gnupg

ARG REFRESHED_AT
ENV REFRESHED_AT $REFRESHED_AT
ARG NODE_MAJOR=18

SHELL ["/bin/bash", "-o", "pipefail", "-c"]

RUN mkdir -p /etc/apt/keyrings \
    && curl -fsSL https://deb.nodesource.com/gpgkey/nodesource-repo.gpg.key | gpg --dearmor -o /etc/apt/keyrings/nodesource.gpg \
    && echo "deb [signed-by=/etc/apt/keyrings/nodesource.gpg] https://deb.nodesource.com/node_$NODE_MAJOR.x nodistro main" | tee /etc/apt/sources.list.d/nodesource.list \
    && apt-get update -qq && apt-get install -qq --no-install-recommends \
    nodejs \
    && apt-get upgrade -qq \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
RUN gem install bundler

WORKDIR /app

RUN mkdir -p /images

COPY Gemfile Gemfile.lock ./

RUN bundle check || bundle install

COPY package.json ./

COPY . ./

RUN chmod +x entrypoint.sh

CMD [ "sh", "./entrypoint.sh" ]