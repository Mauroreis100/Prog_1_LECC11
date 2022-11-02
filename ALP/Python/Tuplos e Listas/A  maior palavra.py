#Apresente a quantidade de vogais
palavra=input('Digite uma palavra:')
qtd=0
qtd2=0
b=0
for i in range(len(palavra)):
    if(palavra[i]==' '):
        qtd=qtd+1

"""
while b not in palavra:
    b=b+1
    """  
print(qtd)
#frase[0:3]
#inicio=i+1
#if frase[i]==" ":
#frace[inicio:i]
#inicio ate espaco em branco
