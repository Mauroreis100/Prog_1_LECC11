Algoritmo "pesadaAltura"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19-09-2022
Var
   // Seção de Declarações das variáveis
   altura1, altura2, peso1,peso2:real
   nome1,nome2:caracter

Inicio
   Escreval("Qual é o nome da pessoa 1?")
   leia(nome1)
   Escreval("E qual é o peso da pessoa 1?")
   leia(peso1)
   Escreval("Qual é a altura da pessoa 1?")
   leia(altura1)

   Escreval("Qual é o nome da pessoa 1?")
   leia(nome2)
   Escreval("E qual é o peso da pessoa 1?")
   leia(peso2)
   Escreval("Qual é a altura da pessoa 1?")
   leia(altura2)

   se altura1>=altura2 entao
      Escreval(nome1,"É o mais alto")
   senao
      Escreval(nome2,"É o mais alto")
   fimse
   
    se peso1>=peso2 entao
      Escreval(nome1,"É o mais pesado")
   senao
      Escreval(nome2,"É o mais pesaod")
   fimse



Fimalgoritmo