Algoritmo "1_5parMenorMaior"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21-Aug-22
Var
// Seção de Declarações das variáveis 
      i,idade, alunos, contMaior, contMenor, par: inteiro


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
                                contMaior <- 0
   contMenor <-0
   escreval("Quantos alunos tem na turma?")
   leia(alunos)
        escreval("--------------------------------------------------")
   para i de 1 ate alunos faca
      escreval("Qual é a idade do aluno ",i)
      leia(idade)
      se (idade<=18) entao
         contMenor <- contMenor+1

      senao
      contMaior <- contMaior+1
      fimse
         se(idade%2=0) entao
         par <-idade+par
         fimse
   fimpara
   escreval("Temos na turma ",contMenor, " estudantes menor que 18 anos", contMaior, " estudantes maiores de 18 anos")
   escreval("E a soma das idades pares é de ", par)
Fimalgoritmo