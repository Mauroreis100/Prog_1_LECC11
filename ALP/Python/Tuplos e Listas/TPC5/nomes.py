nomes=[]
opcao=-1
vogais="AaEeIiOoUu"
alfabeto="AaÁáÀàâÂBbCcDdEeÉéÊêFfGgHhIiÍíJjKkLlMmNnOoÓóPpQqRrSsTtUuÚúVvWwXxYyZz"
while(opcao!=0):
    print("1-INSERIR NOME\n0-SAIR DO PROGRAMA")
    opcao=int(input('-->'))
    if(opcao==1):
        nome=input('Nome-->')
        nomes.append(nome)
#1 - ORDEM ALFABETICA
print("Nomes em ordem alfabetica")
for i in range(len(alfabeto)):
    letra=alfabeto[i]
    for j in range(len(nomes)):
        nomeEmNomes=nomes[j]
        if letra==nomeEmNomes[0]:
            print(nomes[j])
print("\n")
#2 - MAIS VOGAIS DO QUE CONSOANTES
print("Nomes com mais vogais do que consoantes:")
for i in range(len(nomes)):
    nameV=nomes[i]
    nrconsoante=0
    nrvogais=0
    for j in range(len(nameV)):
        if nameV[j] in vogais:
            nrvogais=nrvogais+1
        else:
            nrconsoante=nrconsoante+1
    if (nrvogais>nrconsoante):
        print(nameV)
print("\n")
#3 - DUAS VOGAIS SUCESSIVAS
nrvogal=0
print("Nomes com duas vogais sucessivas:")
for i in range(len(nomes)):
    name=nomes[i]
    nrvogal=0
    for j in range(len(name)):
        if name[j] in vogais:
           nrvogal=nrvogal+1
           if nrvogal==2:
               print(nomes[i])   
        else:
            nrvogal=0
print("\n")
