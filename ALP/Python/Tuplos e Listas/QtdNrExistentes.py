numero=int(input('Insira um número'))
vector=(12,3,2,5,7,30,2,4,2,1,13)
qtd=0
for i in vector:
    if(i==numero):
        qtd=qtd+1
print("A quantidade de vezes que o número ",numero," aparece são ",qtd)
