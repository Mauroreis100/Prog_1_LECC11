Algoritmo "pares_ímpares"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   : 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/26/2022
Var
// Seção de Declarações das variáveis 
i, soma, multi: inteiro

Inicio
soma:=0
multi:=1
para i de 0 até 30 faça
     se ((i mod 2)<>0) entao
     soma:= soma+i
     senao
     multi:=multi*i
      fimse

fimpara
Escreva ("O resultado da soma é ", soma, " e da multiplicação ", multi)
Fimalgoritmo