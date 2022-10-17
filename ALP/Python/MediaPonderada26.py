#Exercício 26
codigo=int(input('Insira o código do aluno: '))
nota1=eval(input('Qual foi a 1ª nota do aluno'))
nota2=eval(input('Qual foi a 2ª nota do aluno'))
nota3=eval(input('Qual foi a 3ª nota do aluno'))
if nota1>nota2 and nota1>nota3:
    media=(nota1*4+nota2*3+nota3*3)/(4+3+3)
elif nota2>nota1 and nota2>nota3:
    media=(nota2*4+nota1*3+nota3*3)/(4+3+3)
else:
    media=(nota3*4+nota2*3+nota1*3)/(4+3+3)

if media>=5:
    print(codigo,"\nNotas:",nota1,",",nota2,",",nota3,"\nMédia:",media,"\nAPROVADO")
    print("")
else:
    print(codigo,"\nNotas:",nota1,",",nota2,",",nota3,"\nMédia:",media,"\nREPROVADO")
