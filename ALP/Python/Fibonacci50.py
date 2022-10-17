#Exercício 50
print("Quantos termos da sequência de Fibonacci pretende ver?")
a=0
b=1
n=int(input())
print("-------------------------------")
if n>=2:
    n=n-1
    for i in range(0,n+1):
        a=a+b
        b=a-b
        print(b)
else:
    print("Números maiores ou iguais a 2")

