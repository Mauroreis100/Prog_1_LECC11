Algoritmo "quantidade_gasolina"
// Disciplina   : [Programação]
// Professor   : Rafael
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Shelton Teles Uamusse
// Data atual  : 8/27/2022
Var
dist, temp, vel, litrousado: real

Inicio

Escreval ("Digite o tempo gasto na viagem: ")
leia (temp)

Escreval ("Digite o valor da velocidade: ")
leia (vel)

dist := temp*vel

litrousado := dist/12
Escreva ("A quantidade de gasolina em litros para a viagem é ", litrousado)


Fimalgoritmo