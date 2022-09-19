Algoritmo "fibonacci"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19-09-2022
Var
   // Seção de Declarações das variáveis
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