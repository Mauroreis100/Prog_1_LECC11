Algoritmo "fibonacci"

Var
   a,b,c,n,i:inteiro

inicio
   a<-0
   b<-1

   escreval("Insira quantos elementos pretende ver?")
   leia(n)
   n<-n-1
  para i de i ate n passo 1 faca
    a<-a+b
    b<-a-b
    escreva(b,",")
   fimpara

Fimalgoritmo