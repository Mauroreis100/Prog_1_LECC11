package funcionario;
import java.util.Scanner;

//OBJECT- superclasse mae
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		
		System.out.println("Insira nome ");
		String nome = ler.next();
		String sexo = ler.next();
		short idade = ler.nextShort();
		
		
		Funcionario f = new Funcionario(nome,sexo,idade);
		
		
	
		
		
		
		System.out.println(f);
		//impressao: funcionario.Funcionario@e580929
		
		
		//System.out.println(f1);
	}

}
