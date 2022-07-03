#language: pt
#encoding: UTF-8

@SignIn
Funcionalidade: Sign in
	
	@EmailInvalido
	Cenario: email invalido sign in
		Quando clicar em sign in
		E digitar um email "teste23"
		E clicar no botao Create an account
		Entao mostrar mensagem de erro
	
	@EmailValido
	Cenario: email valido sign in
		Quando clicar em sign in
		E digitar um email "testebruno1@gmail.com"
		E clicar no botao Create an account
		Entao abre a tela de cadastro