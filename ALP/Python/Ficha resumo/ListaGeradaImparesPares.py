a=int(input('Quantos valores tem a sua lista?'))
print()
principalLista=[0]*a
#A lista principalLista terá "a" elementos
qtdP=0 #Esta variavel indica a quantidade de números pares
indexP=0 #Esta variavel será usada para indicar a posição dos pares
indexI=0 #Esta variavel será usada para indicar a posição dos impares
qtdI=0 #Esta variavel indica a quantidade de números impares
print("Quais são os valores da lista?")

#Este ciclo for é usado para a inserção dos valores na lista principal
for i in range(len(principalLista)):
    print("Insira o",(i+1),"º número da lista")
    principalLista[i]=int(input())

 #este ciclo for é usado para contar o número de valores pares e ímpares que estão na lista   
for i in range(len(principalLista)):
    if principalLista[i]%2==0:
        qtdP=qtdP+1
    else:
        qtdI=qtdI+1

#A condição é para garantir que a definição
#do tamanho da lista seja maior que 0, para números pares.
if qtdP>0:
    lista2=[0]*qtdP#Tamanho da lista 2 terá a quantidade de números pares na lista principal
    indexP=0#o indice das posições na lista começa de 0
    #para cada elemento que for par, irá inserir aquele elemento na posição index
    for i in range(len(principalLista)):
        if principalLista[i]%2==0:
            #lista2 no indice x deve ser igual ao par encontrado na lista
            lista2[indexP]=principalLista[i]
            #o indice deve mudar a cada par encontrado na lista principal
            indexP=indexP+1


#A condição é para garantir que a definição
#do tamanho da lista seja maior que 0, para números impares.
if qtdI>0:
    lista3=[0]*qtdI#Tamanho da lista 3 terá a quantidade de números impares na lista principal
    indexI=0#o indice das posições na lista começa de 0
     #para cada elemento que for impar, irá inserir aquele elemento na posição index
    for i in range(len(principalLista)):
        if principalLista[i]%2==1:
            #lista2 no indice x deve ser igual ao impar encontrado na lista
            lista3[indexI]=principalLista[i]
             #o indice deve mudar a cada par encontrado na lista principal
            indexI=indexI+1

#Pq não fiz dentro do mesmo if? Porque temos que garantir que a lista seja maior que 0 para os dois casos (independentemente)
#senão fará lista*0
print("Lista de números inseridos: ", str(principalLista))
print("Lista de pares: ",str(lista2))
print("Lista de ímpares: ",str(lista3))    
