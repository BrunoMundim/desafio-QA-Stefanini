#language: pt
#encoding: UTF-8

@Purchase
Funcionalidade: Finalizar compra
	
	Contexto: entrar na conta
		Quando clicar em sign in
		E eu digitar meu email "testebruno3232@gmail.com"
		E eu digitar minha senha "teste"
		E clicar no botao Sign In
	
	@Wishlist
	Cenario: Adicionar item a lista de desejos
		Quando clicar no menu Dresses
		E clicar no item "Printed Dress"
		E clicar na opcao Add to wishlist
		E clicar no perfil
		E clicar em My Wishlists
		E clicar em view
		Entao aparece o vestido "Printed Dress"
		
	@AdicionarItemCarrinho
	Cenario: Adicionar item ao carrinho
		Quando clicar no menu Dresses
		E clicar no item "Printed Dress"
		E clicar na opcao Add to cart
		Entao adiciona o item ao carrinho
	
	@RemoverItensCarrinho
	Cenario: Remover item do carrinho
		Quando clicar no menu Dresses
		E clicar no item "Printed Dress"
		E clicar na opcao Add to cart
		E excluir o item "Printed Dress" do carrinho
		Entao o carrinho fica vazio
		