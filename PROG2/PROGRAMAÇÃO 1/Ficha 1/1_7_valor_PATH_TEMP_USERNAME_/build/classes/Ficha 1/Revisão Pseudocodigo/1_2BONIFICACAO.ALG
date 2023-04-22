Algoritmo "bonificacao"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21-Aug-22
Var vendasA: real;
   bonificacao: real;
   // Seção de Declarações das variáveis



Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Escreva o valor de vendas alcançado, ao longo do mês: ")
   leia(vendasA)

   se (vendasA<0) ENTAO
      escreval("Valor inválido de vendas!")
   senao
      se (vendasA>=0) e (vendasA<1000) ENTAO
      bonificacao<-vendasA
         escreval("A sua bonificação é de ", bonificacao)
      senao

         se (vendasA>=1000) e (vendasA<5000) ENTAO
            bonificacao<-vendasA-(vendasA*0.04)
            escreval("A sua bonificação é de ", bonificacao)
         senao
            se (vendasA>=5000) e (vendasA<20000) ENTAO
               bonificacao<-vendasA-(vendasA*0.06)
               escreval("A sua bonificação é de ", bonificacao)
            senao
               se (vendasA>20000) entao
                  bonificacao<-vendasA-(vendasA*0.09)
                  escreval("A sua bonificação é de ", bonificacao)
               fimse

            fimse

         fimse

      fimse

fimse

Fimalgoritmo