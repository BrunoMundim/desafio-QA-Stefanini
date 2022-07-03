#language: pt
#encoding: UTF-8

@Search
Funcionalidade: Buscar produto
	
	@ProdutosEncontrados
	Cenario: Procurar produto na barra de pesquisa
		Quando digitar o produto "dress" na barra de pesquisa
		E clicar no botao para pesquisar
		Entao deve mostrar quantos resultados para aquela pesquisa existem
		