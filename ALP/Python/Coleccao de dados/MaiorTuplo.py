#Seja dado o tuplo (2, 4, 23, 1, 76, 3, 36), 
# pretende-se imprimir o maior elemento do tuplo.
tuplo=(2,4,23,1,76,3,100)
a=tuplo[0]
for i in range(len(tuplo)):
    if a<tuplo[i]:
        a=tuplo[i]
print("O maior número no tuplo é ",a)