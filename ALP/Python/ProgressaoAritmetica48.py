a1=int(input('Digite o primeiro termo da progressão aritmetica'))
r=int(input('Digite a razão da progressão aritmetica'))
n=int(input('Número de termo da progressão'))
soma=0
somatudo=0
for i in range(1,n):
    if i==1:
        soma=a1+soma
        print(soma,"")

