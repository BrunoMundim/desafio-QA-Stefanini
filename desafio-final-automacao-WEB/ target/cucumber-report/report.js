$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ServiceTerms.feature");
formatter.feature({
  "name": "Finalizar compra",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@ServiceTerms"
    }
  ]
});
formatter.background({
  "name": "entrar na conta",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicar em sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "SignInSteps.clicarEmSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar meu email \"testebruno3232@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "PurchaseSteps.euDigitarMeuEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar minha senha \"teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "PurchaseSteps.euDigitarMinhaSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao Sign In",
  "keyword": "E "
});
formatter.match({
  "location": "PurchaseSteps.clicarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Nao aceita os termos",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ServiceTerms"
    },
    {
      "name": "@AceitaOsTermos"
    }
  ]
});
formatter.step({
  "name": "clicar no menu Dresses",
  "keyword": "Quando "
});
formatter.match({
  "location": "PurchaseSteps.clicarNoMenuDresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no item \"Printed Dress\"",
  "keyword": "E "
});
formatter.match({
  "location": "PurchaseSteps.clicarNoItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar na opcao Add to cart",
  "keyword": "E "
});
formatter.match({
  "location": "PurchaseSteps.clicarNaOpcaoAddToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no cart",
  "keyword": "E "
});
formatter.match({
  "location": "ServiceTermsSteps.clicarNoCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em proceed to checkout primeira tela",
  "keyword": "E "
});
formatter.match({
  "location": "ServiceTermsSteps.clicarEmProceedToCheckoutPrimeiraTela()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em proceed to checkout segunda tela",
  "keyword": "E "
});
formatter.match({
  "location": "ServiceTermsSteps.clicarEmProceedToCheckoutSegundaTela()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aceitar os termos de servico",
  "keyword": "E "
});
formatter.match({
  "location": "ServiceTermsSteps.aceitarOsTermosDeServico()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em proceed to checkout terceira tela",
  "keyword": "E "
});
formatter.match({
  "location": "ServiceTermsSteps.clicarEmProceedToCheckoutTerceiraTela()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aparece a tela \"PLEASE CHOOSE YOUR PAYMENT METHOD\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "ServiceTermsSteps.apareceATela(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});