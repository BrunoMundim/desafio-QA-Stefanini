#language: pt
#encoding: UTF-8

@ServiceTerms
Funcionalidade: Finalizar compra
	
	Contexto: entrar na conta
		Quando clicar em sign in
		E eu digitar meu email "testebruno3232@gmail.com"
		E eu digitar minha senha "teste"
		E clicar no botao Sign In
	
	@LerTermosDeServico
	Cenario: Ler termos de servico
		Quando clicar no menu Dresses
		E clicar no item "Printed Dress"
		E clicar na opcao Add to cart
		E clicar no cart
		E clicar em proceed to checkout primeira tela
		E clicar em proceed to checkout segunda tela
		E clicar em Read the Terms of Service
		Entao aparece a tela TERMS AND CONDITIONS OF USE
		
	@NaoAceitaOsTermos
	Cenario: Nao aceita os termos
		Quando clicar no menu Dresses
		E clicar no item "Printed Dress"
		E clicar na opcao Add to cart
		E clicar no cart
		E clicar em proceed to checkout primeira tela
		E clicar em proceed to checkout segunda tela
		E clicar em proceed to checkout terceira tela
		Entao aparece a mensagem "You must agree to the terms of service before continuing."
		
	@AceitaOsTermos
	Cenario: Nao aceita os termos
		Quando clicar no menu Dresses
		E clicar no item "Printed Dress"
		E clicar na opcao Add to cart
		E clicar no cart
		E clicar em proceed to checkout primeira tela
		E clicar em proceed to checkout segunda tela
		E aceitar os termos de servico
		E clicar em proceed to checkout terceira tela
		Entao aparece a tela "PLEASE CHOOSE YOUR PAYMENT METHOD"
		
		