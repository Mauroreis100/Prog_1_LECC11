Algoritmo "sequenciaX17"
//Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
//novo x de acordo com a seguinte regra:
//• Se x é par, x = x / 2
//• Se x é impar, x = 3 * x +1
//• Imprime x
//• O programa deve parar quando x tiver um valor final de 1. Por exemplo, para x =
//13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 */
Var
   // Seção de Declarações das variáveis
   x:real


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Insira um valor inteiro e veja a magia...")
   leia(x)

 enquanto x<>1 faca
      se (x%2=0) entao
         x<-x/2
         escreva(x,"->")
      senao
         x<-3*x+1
         escreva(x,"->")
      fimse

   fimenquanto

Fimalgoritmo