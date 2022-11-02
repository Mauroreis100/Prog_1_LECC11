#Seja dado o tuplo (12, 3, 2, 5, 7, 30, 2, 4, 2, 1,13),
#pretende-se saber a quantidade de números pares 
# e números ímpares contidos no vector.
tuplo=(12, 3, 2, 5, 7, 30, 2, 4, 2, 1,13)
qtdP=0
qtdI=0
for i in range(len(tuplo)):
    if tuplo[i]%2==0:
        qtdP=qtdP+1
    else:
        qtdI=qtdI+1
print("Temos no tuplo ",qtdP," números pares e ",qtdI," ímpares")