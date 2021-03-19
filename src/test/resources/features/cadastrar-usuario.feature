#language: pt
#Author: bruno.fernandes

@Executa
Funcionalidade: Cadastro de usuario
  Eu como usuario do sistema
  Desejo realizar o cadastro de novos usuarios
  Para que seja possivel armazenar e gerenciar seus dados
  
    Contexto: Acesar o site para cadastrar um novo usuario
    Dado que eu acesse o site "http://prova.stefanini-jgr.com.br/teste/qa/" para realizar um cadastro

  Cenario: Realizar cadastro de novo usuario
    Quando informar os dados do primeiro usuario
    E informar os dados do segundo usuario
    E informar os mesmos dados do segundo usuario
    E excluo usuario o primeiro usuario
    Entao finalizo o teste
  
  Esquema do Cenario: Realizar cadastro de usuarios incorretos
    Quando insiro nome <nome>
    E insero email <email>
    E insiro senha <senha>
    E tiro print <print>
    Entao encerro o primeiro teste

    Exemplos:
      | nome             | email             | senha      | print                |
      | ""               | "felipe@leal.com" | "12345678" | "nome obrigatorio"   |
      | "Felipe Leal"    | ""                | "12345678" | "email obrigatorio"  |
      | "Felipe Leal"    | "felipe@leal.com" | ""         | "senha obrigatoria"  |
      | ""               | ""                | ""         | "cadastro sem dados" |
      | "Felipe"         | "felipe@leal.com" | "12345678" | "nome incompleto"    |
      | "Felipe Leal"    | "felipeleal.com"  | "12345678" | "email invalido"     |
      | "Felipe Leal"    | "felipe@leal.com" | "1234567"  | "senha invalida"     |