#Exercício 2, Características Físicas
#SEXO: 0 - Masculino e 1 - Femenino
#OLHOS 0-azuis, 1-verdes, 2-castanhos
#CABELOS 0-louros,1-castanhos, 2-Pretos
sexos=[]
olhos=[]
cabelos=[]
idades=[]
opcao=-1
qtd=0
#irá validar as opções esolhidas e
#será uma das condições para cada caracterização
validacao=0
while(opcao!=0):
    print("1-Para inserir dados de um habitante\n0 - Para cancelar ")
    opcao=int(input('-->'))
#SEXO
    if(opcao!=0):
        print("Qual é o sexo do habitante ",(qtd+1)," \n 0-Masculino e 1 - Femenino")
        sexo=int(input('-->'))
        if sexo==1 or sexo==0:
            sexos.append(sexo)
            validacao=0
        else:
            validacao=1
            print("Inserção de sexo inválida")
           
#OLHOS
        if validacao==0:
            print("Qual é a cor dos olhos do habitante ",(qtd+1)," \n0-Azuis\n1-Verdes\n2-Castanhos")
            olho=int(input('-->'))
            if olho==1 or olho==0 or olho==2:
                olhos.append(olho)
            else:
                validacao=1
                print("Inserção de cor dos olhos inválida")           
#CABELOS
        if validacao==0:
            print("Qual é a cor dos cabelos do habitante",(qtd+1)," \n0-Louros\n1-Castanhos\n2-pretos")
            cabelo=int(input('-->'))
            if cabelo==1 or cabelo==0 or cabelo==2:
                cabelos.append(cabelo)
            else:
                validacao=1
                print("Inserção de cor dos cabelos inválida")
#IDADE
        if(validacao==0):
            print("Qual é a idade do habitante ",(qtd+1))
            idade=int(input('-->'))
            idades.append(idade)
            qtd=qtd+1
#alinea a
maior=idades[0]
for i in range(len(idades)):
    if maior<idades[i]:
        maior=idades[i]
print("A maior idade de todos os habitantes é", maior)
#alinea b
verdeLouro=0
for i in range(len(idades)):
    if cabelos[i]==0 and olhos[i]==1:
        verdeLouro=verdeLouro+1
print("\nExiste ",verdeLouro," indivíduos com cabelos louros e com olhos verdes")
#alinea c
femeninos=0
for i in range(len(sexos)):
    if idades[i]<35 and idades[i]>18:
        if sexos[i]==1:
            femeninos=femeninos+1
print("\nExiste ",femeninos," individuos de sexo femenino com idade entre 18 e 35")

print("S:",sexos,"\nO:",olhos,"\nC:",cabelos,"\nI:",idades)
