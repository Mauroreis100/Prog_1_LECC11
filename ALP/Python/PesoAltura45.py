#Exercício número 45
nome1=input('Escreva o nome da pessoa 1: ')
nome2=input('Escreva o nome da pessoa 2: ')
altura1=eval(input('Escreva a altura da pessoa 1: '))
altura2=eval(input('Escreva a altura da pessoa 2: '))
peso1=eval(input('Escreva o peso da pessoa 1: '))
peso2=eval(input('Escreva o peso da pessoa 2: '))
if altura1>altura2:
    print(nome1, " É mais alta")
else:
    print(nome2, " É mais alta")
    
if peso1>peso2:
    print(nome1, " É mais pesada")
else:
    print(nome2, " É mais pesada")

