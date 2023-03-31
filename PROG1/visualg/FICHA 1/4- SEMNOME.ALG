Algoritmo "idade"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   : 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/20/2022
Var
x, idade: inteiro
contmaior, contmenor, contidade: inteiro

Inicio
contmaior <- 0
contmenor <- 0

para x de 1 até 10 faça
     escreva ("Digite idade: ")
     leia (idade)
     
      se idade >=18 entao
 contmaior <- contmaior + 1

 fimse
  se idade < 18 entao
  contmenor <- contmenor + 1
  fimse

       escreval ("Número de maiores de idade: ", contmaior)
       escreval ("Número de menores de idade ", contmenor)

fimpara

 

Fimalgoritmo