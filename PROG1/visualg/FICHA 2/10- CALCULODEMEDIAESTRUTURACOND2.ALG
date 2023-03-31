Algoritmo "calculodemediaestruturacond2"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/14/2022
Var
nota1, nota2, media: Real

Inicio
Escreval ("--------------------------------------------- ")
Escreval ("Instituto Superior de Trasporte e Comunicacao ")
Escreval ("--------------------------------------------- ")

Escreva (" Digite a primeira nota: ")
Leia (nota1)

Escreva ("Digite a segunda nota: ")
Leia (nota2)

media <- (nota1 + nota2)/2

Se (media >=14) entao
   Escreval ("O aluno dispensou com media", media. )

Senao
     Se ((media >=10) e (media <14)) entao
   Escreval ("O aluno foi aprovado com media", media. )
   senao
     Escreval ("O aluno foi reprovado com media", media)
     fimse
fimse

Fimalgoritmo