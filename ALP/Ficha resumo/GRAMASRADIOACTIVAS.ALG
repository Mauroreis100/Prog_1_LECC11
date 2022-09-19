Algoritmo "gramasradioactivas"
// 
//  
//37.Um determinado material radioativo perde metade de sua
//massa a cada 50 segundos.
//Dada a massa inicial, em gramas,
//faça um programa que determine o tempo necessário para
//que essa massa se torne menor que 0,05 gramas.
Var
// Seção de Declarações das variáveis 

i,m:inteiro
n:real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
     i<-0
escreval("Quantos gramas tem o seu material radioactivo?")
leia(n)
enquanto (n>0.05) faca
     n<-n/2
     m<-i*50
     i<-i+1
     fimenquanto

     escreval("O tempo necessário para que a massa do seu material radioactivo seja menor ",m," segundos")

Fimalgoritmo