Algoritmo "ex34"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 9/2/2022
Var
i, idade, idademenos170, contidademenos170, nrdebaixos, nralturamaior20 : inteiro
idademedia, alturamedia, altura, alturamaior20: real


Inicio
idademenos170 := 0
contidademenos170 := 0
alturamaior20 := 0

para i de 1 ate 5 faca
Escreva("Insisra a sua idade: ")
leia(idade)
Escreva("Insira a sua altura em metros: ")
leia(altura)
// alínea a)
  se (altura < 1.70) entao
idademenos170 := idademenos170 + idade

contidademenos170 := contidademenos170 + 1
// alinea b)
   se idade > 20 entao
alturamaior20 := alturamaior20 + altura
nralturamaior20 := nralturamaior20 + 1


   fimse
  fimse
fimpara
alturamedia := alturamaior20/alturamaior20
idademedia := idademenos170/contidademenos170

Escreva ("altura media", alturamedia, " e idade media ", idademedia)

Fimalgoritmo