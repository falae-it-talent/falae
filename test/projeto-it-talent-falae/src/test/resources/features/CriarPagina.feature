#language: pt
  Funcionalidade: Criar Pagina

    @cenario_68
    Cenario: 68 - Criar pagina com sucesso
      Dado que o usuario esteja na pagina sobre do site FALAE
      E o usuario está logado no sistema
      E o usuario clicar no link "Pranchas"
      E o usuario clicar na prancha
      E o usuario clicar no botao do "Criar Página"
      Quando o usuario preencher o  campo nome da pagina
      E o usuario preencher o campo colunas
      E o usuario preencher o campo linhas
      E o usuario clicar no botao "Criar"
      Entao o sistema exibe uma mensagem de sucesso: "Página criada com sucesso."