Algoritmo "desconto_veiculo"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/28/2022
Var
ano_carro, cont1, cont2,: inteiro
desc1, preco_carro, preco_apagar1: real
resposta: caractere


Inicio
cont1:= 0
cont2:= 0
resposta := "s"

enquanto (resposta = "s") faca
Escreval ("Digite o ano do carro: ")
leia (ano_carro)

Escreva ("Digite o preço do carro: ")
leia (preco_carro)

se (ano_carro<=2000) entao
desc1:= preco_carro*0.12
preco_apagar1:= preco_carro - desc1
cont1:= cont1+1

senao
 se (ano_carro>2000) entao
desc1:= preco_carro*0.07
preco_apagar1:= preco_carro - desc1
cont2:= cont2+1

 fimse

fimse
Escreval ("Valor de desconto é ", desc1, " e o preço a pagar é ", preco_apagar1)
Escreval ("Deseja continuar? [s/n]")
leia (resposta)
fimenquanto
Escreval ("Total de carros foi até 2000 é ", cont1)
Escreval ("O total dos carros geral é ", cont1+cont2)
Fimalgoritmo