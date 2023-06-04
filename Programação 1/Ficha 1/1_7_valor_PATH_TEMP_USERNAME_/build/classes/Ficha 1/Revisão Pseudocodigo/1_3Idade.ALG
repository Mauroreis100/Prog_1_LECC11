Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21-Aug-22
Var idade1, idade2, dif: inteiro;
   // Seção de Declarações das variáveis


Inicio
   escreval("Idade do amigo 1")
   leia(idade1)
   escreval("Idade do amigo 2")
   leia(idade2)

   se (idade1 > idade2) entao
      dif <- idade1-idade2
      escreval("Amigo 1 é mais velho que amigo 2 com ", dif, " anos de diferença")
   senao
      dif <- idade2-idade1
      escreval("Amigo 2 é mais velho que amigo 1 com ", dif, " anos de diferença")
   fimse

   // Seção de Comandos, procedimento, funções, operadores, etc...


Fimalgoritmo