Algoritmo "progressaoAritmetica"

Var
// Seção de Declarações das variáveis
i,n:inteiro
a1,soma,somaTudo,r:real




Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Digite o número de termos de uma progressão aritmética")
leia(n)
Escreval("Digite o 1º número de termo da progressão")
leia(a1)
Escreval("Digite a razão")
leia(r)
soma<-0
somaTudo<-0
para i de 1 ate n passo 1 faca
 se i=1 entao
        soma<-a1+soma

        //somaTudo<-soma+somaTudo
 fimse
  escreva(soma,",")
  somaTudo<-soma+somaTudo
 soma<-soma+r


fimpara
     escreval("")
     escreval("Soma dos termos:",somaTudo)

Fimalgoritmo