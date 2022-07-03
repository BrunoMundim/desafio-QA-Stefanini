#language: pt
#encoding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario

	Contexto:
		Quando clicar em sign in
		E digitar um email "testebruno3@gmail.com"
		E clicar no botao Create an account
	
		@FirstName
		Cenario: first name nao preenchido
			Quando digitar First Name ""
			E clicar no botao Register
			Entao erro por nao preencher first name
		
		@LastName
		Cenario: last name nao preenchido
			Quando digitar Last Name ""
			E clicar no botao Register
			Entao erro por nao preencher last name
		
		@Password
		Cenario: password nao preenchido
			Quando digitar password ""
			E clicar no botao Register
			Entao erro por nao preencher password
		
		@Adress
		Cenario: adress nao preenchido
			Quando digitar adress ""
			E clicar no botao Register
			Entao erro por nao preencher adress
			
		@City
		Cenario: city nao preenchido
			Quando digitar city ""
			E clicar no botao Register
			Entao erro por nao preencher city
			
		@State
		Cenario: state nao preenchido
			Quando clicar no botao Register
			Entao erro por nao preencher state
			
		@Country
		Cenario: country nao preenchido
			Quando escolher country "-"
			E clicar no botao Register
			Entao erro por nao preencher country
		
		@ZipcodeInvalido	
		Cenario: zipcode incorreto
			Quando digitar zipcode "1234"
			E clicar no botao Register
			Entao erro por preencher zipcode
		
		@MobilePhone
		Cenario: mobile phone nao preenchido
			Quando digitar mobile phone ""
			E clicar no botao Register
			Entao erro por nao preencher mobile phone
	
		@Geral
		Cenario: cadastro com informacoes completas
			Quando escolher genero
			E digitar First Name "NomeTeste"
			E digitar Last Name "SobrenomeTeste"
			E digitar password "SenhaTeste"
			E digitar adress "EnderecoTeste"
			E digitar city "CidadeTeste"
			E digitar state "Alabama"
			E digitar zipcode "12345"
			E digitar mobile phone "218-278-2415"
			E clicar no botao Register
			Entao abrira a tela My Account
			