Algoritmo "salario_bruto_liquido1.1"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   : 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/26/2022
Var
sl, sb, IRPS, sh, h, imposto: real


Inicio
sh := 148
h := 168
IRPS := 0.0914
sb := sh*h
Escreval ("O salário bruto é de ", sb, " meticais")
imposto := sb* IRPS

Escreval ("O desconto do imposto é de ", imposto)

sl := sb - imposto
Escreva ("O valor do salário líquido é ", sl)


Fimalgoritmo