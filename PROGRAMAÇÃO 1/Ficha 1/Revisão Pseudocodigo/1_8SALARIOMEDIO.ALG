Algoritmo "1_8SalarioMedio"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21-Aug-22
Var
// Seção de Declarações das variáveis
i, nrEmpregados:inteiro
  salarioSoma,salarioMedio,salario: real;
 

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Escreva o número de empregados da Instituição")
leia(nrEmpregados)
para i de 1 ate nrEmpregados faca
       escreval ("Qual é o salário do empregado ",i,"?")
       leia(salario)
       salariosoma<-salario+salariosoma
fimpara
       salarioMedio<-salarioSoma/nrEmpregados
       escreval("O salário médio dos empregados é de ", salarioMedio)

Fimalgoritmo