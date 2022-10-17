#Exercício 46
n=int(input('Insira quantos números da sequência quer ver: '))
i=1
e=1
n=n-1
while i<=n:
    fact=1
    j=i
    while j>0:
        fact=fact*j
        j=j-1
    i=i+1
    e=e+1/fact
print(e)
