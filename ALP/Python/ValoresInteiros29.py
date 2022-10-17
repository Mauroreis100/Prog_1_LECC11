#Exercício 29
b=0
soma=0
for i in range(1,51):
    print(i,"º")
    a=int(input('Número inteiro: '))
    if a>0:
        soma=soma+a
    else:
        b=b+1
print("A soma dos números positivos é igual a ",soma,"\nE temos ",b," números negativos.")

