Algoritmo "test"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/20/2022
Var
num, i, soma, nr: inteiro
media: real


Inicio
i <- 1
soma <- 0
escreva ("insira um nr")
leia (nr)
     enquanto i <= nr faça
        Escreva ("Digite um número: ")
        leia (num)
        soma <- soma + num
        i <- i + 1
     fimenquanto
     media <- soma/6

     escreval ("A média é: ", media)
     


Fimalgoritmo