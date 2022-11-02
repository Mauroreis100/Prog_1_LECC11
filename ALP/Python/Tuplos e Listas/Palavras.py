palavras=[]
frase=input('Escreva a sua frase')
frases1=frase+" "
inicio=0
for i in range(len(frases1)):
    if frase1[i]==" ":
        palavra=frases1[inicio:i]
        inicio=i+1
        palavras.append(palavra)
print(palavras)
