Algoritmo "ex34"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 9/2/2022
Var
   idademedia, alturamedia, altura,somaidade, somaaltura: real
   contidade,contaltura,i, idade :inteiro

Inicio
   somaidade := 0
   contidade:= 0
   somaaltura := 0
   contaltura:=0

   para i de 1 ate 5 faca
      Escreva("Insisra a sua idade: ")
      leia(idade)
      Escreva("Insira a sua altura em metros: ")

      leia(altura)
      // alínea a)
      se (altura < 1.70) entao
         somaidade := somaidade + idade
         contidade := contidade + 1
      fimse

      // alinea b)
      se idade > 20 entao
         somaaltura := somaaltura + altura
         contaltura := contaltura + 1



      fimse
   fimpara
   alturamedia := somaaltura/contaltura
   idademedia := somaidade/contidade

   Escreva ("altura media", alturamedia, " e idade media ", idademedia)

Fimalgoritmo