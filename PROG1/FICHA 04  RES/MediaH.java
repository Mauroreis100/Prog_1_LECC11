/*Ex11
Desenvolva um programa que permite introduzir um conjunto de alturas de `n´ estudantes da turma l16. O valor da altura pode ser em metros ou em cm
(à escolha de cada um). No programa deve mostrar a média de todas as alturas dos estudantes da referida turma.
*/

import java.util.Scanner;
public class MediaH{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	//usar a variável soma para adicionar as alturas, para posteriormente dividir com o n de modo a obter a altura
	int n, i, soma=0;//i declara-se dentro da  estrutura for
	double altura, media;
	System.out.println("Insira o numero de estudantes da turma");
	n=ler.nextInt();
		System.out.println("Insira "+n+" alturas em centimetros ou metros");
		for(i=1;i<=n;i++){//se inicializar a 0 para imprimir 4 alturas deve colocar i<n 
		
		altura=ler.nextInt();
		soma+=altura;
	
		}
		media=soma/n;
		System.out.println("Na turma de "+n+" alunos, a media das alturas e "+media);
	}
}