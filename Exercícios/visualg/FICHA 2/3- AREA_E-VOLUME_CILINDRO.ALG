Algoritmo "area_e-volume_cilindro"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   : 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Shelton Teles Uamusse
// Data atual  : 8/24/2022
Var
// Seção de Declarações das variáveis 
r, h, A, V: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva ("Insira o valor do raio: ")
leia (r)
Escreva ("Insira o valor da altura: ")
leia (h)

A := 2*(pi*r^2)+2(pi*r*h)

V := pi*(r^2)*h
Escreva ("O valor da área é ",A, " e o valor do volume é ", V )

Fimalgoritmo