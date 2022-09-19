Algoritmo "multiplicarSemMultiplicar"

//38.Sem  utilizar  a  operação  de
//multiplicação,  escreva  um  programa
//que  multiplique
// dois números inteiros. Por exemplo: 2 * 2 = 2 + 2.
Var
// Seção de Declarações das variáveis 
i,j,multi,n,a:inteiro

Inicio
escreval("Primeiro número da multiplicação")
leia(n)
Escreval("Segundo número da multiplicação")
leia(a)
j<-n
n<-n-1
multi<-0
para i de i ate n passo 1 faca
multi<-multi+a
fimpara
escreval("A multiplicação de ",a,"*",j,"=",multi)
Fimalgoritmo