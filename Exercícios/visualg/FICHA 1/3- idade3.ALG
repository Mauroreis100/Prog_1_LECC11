Algoritmo "idade"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/17/2022
Var
   idade1, idade2, d: inteiro
   nome1, nome2: caractere

Inicio
   Escreval ("Digite seu nome: ")
   Leia (nome1)
   Escreval ("Digite sua idade: ")
   Leia (idade1)

   Escreval ("Digite seu nome: ")
   Leia (nome2)
   Escreval ("Digite sua idade: ")
   Leia (idade2)

   se (idade1 > idade2) entao
   d:= idade1 - idade2
      Escreval ("O mmais velho é ", nome1, " a diferença de idade é ", d)

   senao
   d:= idade2-idade1
      Escreva ("O mmais velho é ", nome2, " a diferença de idade é ", d)
   fimse


Fimalgoritmo