Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/11/2022
Var
// Seção de Declarações das variáveis 
a,b,i: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite um valor para a")
leia(a)
escreval("Digite valor de b")
leia(b)
se a<b entao:
escreval("são multiplos de b")
para i de 1 ate 10 passo faca:
b=b*i
escreval(b)
senao
escreval("não são multiplos de a e b")
fimse
fimpara
se a%b==0 entao:
escreval("são multiplos de a e b")
para i de 1 ate 10 passo faca
a=a*i
fimse
fimpara

Fimalgoritmo