Algoritmo "1_6Pares20a2000"

Var
   i,par:inteiro
Inicio

   para i de 19 ate 2000 faca

      i<-i+1
      se (i%2=0) entao
         escreva(i, " ")
         par <-i+par
      fimse
   fimpara
   escreval("E a soma dos numeros pares é igual a:", par)

Fimalgoritmo