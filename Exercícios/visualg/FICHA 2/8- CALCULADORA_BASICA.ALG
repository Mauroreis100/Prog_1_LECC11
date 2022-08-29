Algoritmo "calculadora_basica"
// Disciplina   : [Algoritmo e Lógica de Programação]
// Professor   :  Rafael
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Shelton Teles Uamusse
// Data atual  : 8/27/2022
Var
n1, n2, x: real
operacao: caractere

Inicio
      Escreval ("Digite o primeiro número: ")
      leia (n1)
      
      Escreval ("Selecione a operação ( + - * /): ")
      leia (operacao)

      Escreval ("Insira o segundo número: ")
      leia (n2)
      
      escolha operacao
              caso "+"

                   x:= n1 + n2
              Escreva (n1, " ", operacao, " ", n2, " = ", x )
              caso "-"

                   x:= n1 - n2
              Escreva (n1, " ", operacao, " ", n2, " = ", x )
              
              caso "*"

                   x:= n1 * n2
              Escreva (n1, " ", operacao, " ", n2, " = ", x )
              caso "/"

                   x:= n1 / n2
              Escreva (n1, " ", operacao, " ", n2, " = ", x )

              outrocaso
                   Escreva ("Opção inválida")


      fimescolha
      

Fimalgoritmo