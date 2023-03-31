Algoritmo "media_ponderada"
// Disciplina   : [Programação]
// Professor   : Rafael Mpfumo
// Descrição   : CÁLCULO DA MÉDIA PONDERADA
// Autor(a)    : SHELTON TELES UAMUSSE
// Data atual  : 8/20/2022
Var
   nome : caracter
   exame1, exame2, exame3, exame4, p1, p2, p3, p4, media : real

Inicio
   Escreval ("Insira o nome do estudante: ")
   leia (nome)



   Escreval ("Insire a nota do primeiro exame: ")
       leia (exame1)

   Escreval ("Insire a nota do segundo exame: ")
   leia (exame2)

   Escreval ("Insire a nota do terceiro exame: ")
   leia (exame3)

   Escreval ("Insire a nota do quarto exame: ")
   leia (exame4)

   p1 := 50/100
   p2 := 25/100
   p3:= 25/100
   p4:= 50/100

   media:= (p1*exame1 + p2*exame2 + p3*exame3 + p4*exame4)/p1+p2+p3+p4

   Escreval ("O estudante ", nome, " teve media ", media)
   Escreval (" As notas inseriads foram ", exame1, exame2, exame3, exame4)

Fimalgoritmo