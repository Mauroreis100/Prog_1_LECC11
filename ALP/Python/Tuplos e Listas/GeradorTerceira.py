lista1=[0]*10
lista2=[0]*10
lista3=[0]*10

for i in range(len(lista1)):
    lista1[i]=int(input('Insira o 10 valores da 1ª lista '))

for i in range(len(lista2)):
    lista2[i]=int(input('Insira o 10 valores da 2ª lista '))

for i in range(10):
    lista3[i]=lista1[i]+lista2[i]

for i in range(len(lista3)):
    print(lista3[i])