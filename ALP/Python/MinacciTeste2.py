print("Quantos numeros da sequencia de Fibonacci pretende ver?")
x=eval(input())
b=1
a=0

for i in range(0,x):
    c=a+b
    print(a)
    a=b
    b=c
