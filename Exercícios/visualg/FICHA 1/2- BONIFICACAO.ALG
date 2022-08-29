Algoritmo "bonificacao"
// Disciplina   : [Programação]
// Professor   : Rafael Mpfumo
// Descrição   : bonificação
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 8/20/2022
Var
   valor_de_vendas, bonificacao: real
   opcao, valor: inteiro

Inicio
   Escreval ("Valor de vendas")
   Escreval ("*****************")
   Escreval ("1: 0 à 1000")
   EscrevaL ("2: 1000 à 5000")
   Escreval ("3: 5000 à 20000")
   Escreval ("4: Mais de 20000")
   Escreval ("*****************")
   
   Escreval ("Escolhe a opcao com valor correspondente: ")
   leia (opcao)
   Escreval ("valor de venda:")
   leia (valor)

   se opcao = 1 entao
      bonificacao <- valor
   senao
        se opcao = 2 entao
           bonificacao <- valor - (valor*0.04)
        senao
             se opcao = 3 entao
                bonificacao := valor-(valor*0.06)
             senao
                  se opcao = 4 entao
                     bonificacao := valor-(valor*0.09)

                     
                  fimse
                
             fimse
        fimse
   fimse

  Escreva ("bonificacao sera:", bonificacao)


Fimalgoritmo