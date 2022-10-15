print("Digite um número")
a=int(input('-'))
m=0
i=0

while m<a:
   i=i+1
   m=i*i
   if(m<a):
       j=m
#i=i-1
print("O maior quadrado menor que",a," é:",j)
