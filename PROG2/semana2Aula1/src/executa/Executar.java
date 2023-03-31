package executa;

import java.util.Scanner;
import pessoa.Pessoa;


public class Executar {
	public static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		
		Pessoa p= new Pessoa();
		
		System.out.println("Insira o nome da pessoa: ");
		p.setNome(ler.next());
		String nome1;
		nome1 = p.getNome();
		//FazerAniversario
		
		System.out.println("Insira a idade");
		p.setIdade(ler.nextByte());
		
		p.FazerAniversario();
		
		
		
		p.mostrar(nome1);
		
	}
}

/*

public class Pessoa {
	
	 String nome;
	 int idade;
	
	//Método Faz Aniversário
	void FazAniversario(){
		int niver = this.idade+1;
		this.idade = niver;
	}
	
	void mostra(){
		System.out.println(&quot;Nome:&quot; + this.nome); 
		System.out.println(&quot;Idade antes do Aniversário:&quot; + this.idade); 
	
}
}
public class AplicPessoa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = &quot;João Moura&quot;;
		p1.idade = 22;
		p1.FazAniversario();
		p1.mostra();
		
		
		
		System.out.println(&quot;--------------------------------------&quot;);
		Pessoa p2 = new Pessoa();
		p2.nome = &quot;Carla&quot;;
		p2.idade = 45;
		p2.FazAniversario();
		p2.mostra();
	
		
	
	}
}
  
 */