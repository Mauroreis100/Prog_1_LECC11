#Factorial man 1+1/1!+1/2!+1/3!
x=eval(input('Insira um numero'))
i=1
e=1
while i<=x:
    fact=1
    j=i
    while j>0:
        fact=fact+j
        j=j-1
    i=i+1
    e=e+1/fact
print(e)
