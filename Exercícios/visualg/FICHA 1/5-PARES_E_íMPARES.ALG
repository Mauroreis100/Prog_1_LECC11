Algoritmo "pares_e_ímpares"
// Disciplina   : [Programação]
// Professor   : Rafael
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : SHELTON TELES UAMUSSE
// Data atual  : 8/21/2022
Var
i : inteiro


Inicio
Escreval ("O números pares no intervalo de 20 à 2000 são: ")
para i de 20 até 2000 faça
     se ((i mod 2)=0) entao
          se (i <> 2000) entao
              Escreva (i, ",")
          senao
              Escreva (i)
          fimse
     fimse
fimpara
Fimalgoritmo