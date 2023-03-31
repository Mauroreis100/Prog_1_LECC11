Algoritmo "desconto_veiculo"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   : 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/28/2022
Var
ano_carro, cont1, cont2: inteiro
desc1, desc2, preco_carro, preco_apagar1, preco_apagar2: real
resposta: caractere


Inicio
cont1:= 0
cont2:= 0

Escreval ("Digite o ano do carro: ")
leia (ano_carro)

Escreva ("Digite o preço do carro: ")
leia (preco_carro)

desc1:= preco_carro*0.12
desc2:= preco_carro*0.07
preco_apagar1:= preco_carro - desc1
preco_apagar2:= preco_carro - desc2

Repita


se (ano_carro<=2000) entao

Escreval ("Valor de desconto é ", desc1, " e o preço a pagar é ", preco_apagar1)
senao
 se (ano_carro>2000) entao

Escreval ("Valor de desconto é ", desc2, " e o preço a pagar é ", preco_apagar2)
 fimse

fimse
Escreval ("Deseja continuar? [s/n]")
leia (resposta)
ate (resposta= "n")
Fimalgoritmo