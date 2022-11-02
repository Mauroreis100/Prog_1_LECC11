#Apresente a quantidade de vogais
palavra=input('Digite uma palavra:')
qtd=0
for i in palavra:
    if(i in 'aeiouAEIOU'):
        qtd=qtd+1
print("Temos na palavra ",qtd, " vogais")
