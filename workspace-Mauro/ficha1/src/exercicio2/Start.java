package exercicio2;
import java.util.Scanner;
import java.util.Arrays;
public class Start {
public static void main(String[] args) {
	//pessoas agora é um array de objectos
	Pessoa pessoas[] = new Pessoa[4];
	
	//pessoa agora é uma váriavel objecto
	Pessoa pessoa=new Pessoa();
	
	//conheces scanner
	Scanner ler=new Scanner(System.in);
	
	//ciclo de 4 inserções
	for(int i=0; i<4;i++) {
		//como expliquei no ficheiro Pessoa.java
		//Primeiro faço o set aos objectos
		System.out.println("["+(i+1)+"] "+"ID: ");
	pessoa.setId(ler.nextInt());
	System.out.println("["+(i+1)+"] "+"Nome: ");
	pessoa.setNome(ler.next());
	System.out.println("["+(i+1)+"] "+"Idade: ");
	pessoa.setIdade(ler.nextInt());
	System.out.println("["+(i+1)+"] "+"Nacionalidade: ");
	pessoa.setNacionalidade(ler.next());
	/*Até aqui o objecto está todo preenchido
	Então vamos usar uma váriavel do tipo objecto para adicionar o nosso objecto todo
	dentro do array, (n sei fazer directo)...
	Criei o people que get* pega todos os elementos preenchidos
	*/
	
	Pessoa people=new Pessoa(pessoa.getId(),pessoa.getNome(),pessoa.getIdade(),pessoa.getNacionalidade());
	//public Pessoa(int id, String nome, int idade, String nacionalidade)
	
	//isto é só um i de controle
	System.out.println(i);
	
	//Adiciona-se ao array de objecto o objecto people com toda aquela informação
	pessoas[i]=people;
	}
	
	//Imprimindo cada array de objecto n sei como devemos fazer ainda
	System.out.println(pessoas[0].toString());
	System.out.println(pessoas[1].toString());
	System.out.println(pessoas[2].toString());
	System.out.println(pessoas[3].toString());
	
	//Actualização da 2ª pessoa
	pessoas[2].setNacionalidade("Moçambicanês");
	//impressão
	System.out.println("Actualização do 2º"+pessoas[2].toString());
}
}
