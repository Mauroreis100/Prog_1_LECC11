#Exercício 37
massa=eval(input('Qual é a massa do material radioactivo: '))
a=0
while massa>0.05:
   massa=massa/2
   a=a+1
print("Será necessário ",a*50," segundos para que se torne 0.05 gramas")

