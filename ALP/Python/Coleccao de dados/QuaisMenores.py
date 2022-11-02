from re import A


#Exercício 5
tuplo=(3,4,5,6,7)
a=int(input('Digite um número'))

print("Os números me6nores que ",a," são:")
for i in tuplo:
    if i<a:
        print(i)