a=eval(input('Insira A'))
b=eval(input('Insira B'))
if (a>b and a%b==0) or (b>a and b%a==0):
    print("São múltiplos")
else:
    print("Não são múltiplos")
