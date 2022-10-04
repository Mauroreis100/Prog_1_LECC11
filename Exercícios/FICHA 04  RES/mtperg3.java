/*
Desenvolva um programa em Java que permita criar uma variável nome, atribuindo o seu nome completo, e duas variáveis x e y com os valores 2562 e 1415 respectivamente. O
programa deve efectuar a soma, multiplicação, subtracção, divisão e resto da divisão entre dois números inteiros fornecidos e mostrar na tela o seu nome com os resultados
obtidos
*/
import java.util.Scanner;
public class mtperg3{
	public static void main(String []args){
	Scanner ler=new Scanner(System.in);
	String nome;
	int x=2562,y=1415, sub;
	double divisao,mod;
	System.out.println("Insira o seu nome");
	nome=ler.nextLine();
	sub=x-y;
	divisao=x/y;
	mod=x%y;
	System.out.println(nome);
	System.out.println("Adicao= "+x+y);
	System.out.println("Subtracao= "+sub);
	System.out.println("Multiplicacao "+x*y);
	System.out.println("Divisao "+divisao);
	System.out.println("Resto da divisao "+mod);
	}
	
}