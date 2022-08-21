Algoritmo "1_9LojaDesconto"

Var
      desconto,precoP: real


Inicio
escreval("Qual é o preço do produto?")
leia(precoP)

se precoP>2500 entao
     desconto<-precoP-(PrecoP*0.15)
      escreval("Então o cliente irá pagar",desconto, ",00MT com 15% de desconto")
senao
desconto<-precoP-(PrecoP*0.08)

      escreval("Então o cliente irá pagar",desconto, ",00MT com 8% de desconto")
     fimse
Fimalgoritmo