#language: pt

  Funcionalidade: 14-Editar Pagina

    @cenario_82
    Cenario:  82 - Editar pagina com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar no botao do "Editar"
      E o usuario preencher o campo nome do editar pagina
      E o usuario clicar no botao "Atualizar"
      Entao o sistema exibe uma mensagem de sucesso: "Página atualizada com sucesso."

    @cenario_83
    Cenario: 83 - Editar pagina com nome em branco
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario selecionar a prancha
      E o usuario clicar na pagina
      Quando o usuario clicar no botao do "Editar"
      E o usuario nao preencher o  campo nome do editar pagina
      E o usuario clicar no botao "Atualizar"
      Entao o sistema exibe uma mensagem de erro: "Nome não pode ficar em branco"
