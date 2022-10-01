Algoritmo "exer43"

// Disciplina   : [Algoritmo e Lógica de Programação]

// Professor   :

// Descrição   : CÁLCULO DO NR PERCENTUAL DE VEZES QUE USARAM RESTAURANTE

// Autor(a)    : SMSG

// Data atual  : 9/1/2022

Var

   contmenos10, cont1015, contmais15, quant: inteiro

   percmenos10, perc1015, percmais15 : real

   resposta : caractere



Inicio

   contmenos10 := 0

   cont1015 := 0

   contmais15 := 0

   resposta := "s"




   enquanto (resposta = "s") faca

      Escreva ("Quantas vezes foi ao restaurante?")

      leia (quant)

      se (quant<10) entao

         contmenos10 := contmenos10 + 1


      senao

         se (quant>15) entao

            contmais15 := contmais15 + 1

         senao

            cont1015 := cont1015 + 1



         fimse



      fimse

      Escreva ("Tem mais alunos? ")

      leia (resposta)

   fimenquanto



   percmenos10 := (contmenos10*100)/(contmenos10+cont1015+contmais15)

   perc1015 := (cont1015*100)/(contmenos10+cont1015+contmais15)

   percmais15 := (contmais15*100)/(contmenos10+cont1015+contmais15)





   Escreval ("Percentual de menos de 10 vezes: ", percmenos10, "%")

   Escreval ("Percentual entre 10 e 15 vezes: ", perc1015, "%")

   Escreval ("Percentual de mais de 15: ", percmais15, "%")

Fimalgoritmo