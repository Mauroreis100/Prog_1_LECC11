Algoritmo "maiorMenor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21-Aug-22
Var
   // Seção de Declarações das variáveis
   i,idade, alunos, contMaior, contMenor, contIdade: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   contMaior <- 0
   contMenor <-0
   escreval("Quantos alunos tem na turma?")
   leia(alunos)

   para i de 1 ate alunos faca
      escreval("Qual é a idade do aluno ",i)
      leia(idade)
      se (idade<=18) entao
         contMenor <- contMenor+1
      senao
      contMaior <- contMaior+1
      fimse

   fimpara
   escreval("Temos na turma ",contMenor, " estudantes menor que 18 anos", contMaior, " estudantes maiores de 18 anos")

Fimalgoritmo