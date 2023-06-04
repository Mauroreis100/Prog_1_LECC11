package exercicio2;
import java.util.Scanner;
public class Executa {
	public static void main ( String [] args) {
	Scanner input = new Scanner(System.in);
	//atribuir o objecto a uma variavel
	Pessoa pessoas = new Pessoa();
	System.out.println("insira o nome");
	pessoas.nome = input.nextLine();
    System.out.println("insira o id");
    pessoas.id = input.nextInt();
    System.out.println("insira a idade");
	pessoas.idade = input.nextInt();
	
	
    int n=1;
    
	while (n>0) {
		
	System.out.println("insira um numero negativo para parar");
	 n = input.nextInt();
	 if (n>0) {
	 pessoas.CompletarAnos();
	}
	}
	System.out.println(pessoas.imprimir());
	
	
	
	
	}
}
