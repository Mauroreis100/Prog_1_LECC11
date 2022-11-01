#Exercício 48
a1=int(input('Digite o primeiro termo da progressão aritmetica: '))
r=int(input('Digite a razão da progressão aritmetica: '))
n=int(input('Quantos números da progressão quer ver? : '))
soma=0
somatudo=0
for i in range(1,n+1):
    if i==1:
        soma=a1+soma
    print(soma,"")
    somatudo=soma+somatudo
    soma=soma+r
print("A soma dos termos é",somatudo)

