#Numero 1, STV
codigo=[0]*10
nome=[0]*10
votos=[0]*10
print("------------Nomes dos participantes do DESAFIO TOTAL----------")
for i in range(len(codigo)):
    print("Digite o nome do participante de código",i,": ")
    nome[i]=input('-->')
    codigo[i]=i

qtd=0
opcao=11
while opcao>=0:
    print("Escreva uma sms com código do seu participante predilecto.\n!!Insira um número negativo para terminar as votações!!\nParticipantes:")
    print("Códigos:\t Nomes:")
    for i in range(len(codigo)):
        print(codigo[i],"\t\t",nome[i])
    opcao=int(input('-->'))
    if opcao>=0:
        votos[opcao]=votos[opcao]+1
        qtd=qtd+1
vencedor=votos[0]
for i in range(10):
    if(votos[i]>vencedor):
        vencedor=votos[i]
        posicao=i
    else:
        posicao=0
media=(vencedor/qtd)*100
print("Dos ",qtd, "votos, o(a) participante com mais votos foi",codigo[posicao],"-",nome[posicao],"com ",media,"% dos votos")


