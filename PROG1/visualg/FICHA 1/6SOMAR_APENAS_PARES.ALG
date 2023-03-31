Algoritmo "somar_apenas_pares"
// Disciplina   : [Programação]
// Professor   : Rafael
// Descrição   : No intervalo de 20 à 2000 somar apenas os pares
// Autor(a)    : Shelton Teles Uamusse
// Data atual  : 8/21/2022
Var
i: inteiro
soma : inteiro

Inicio
soma := 0
Escreval ("Os números pares são")
para i de 20 até 2000 faça
   se ((i mod 2)=0) entao
soma := soma + i
       Escreva (i, ",")

   fimse
      

fimpara

Escreva ("O resultado da soma é: ", soma)



Fimalgoritmo