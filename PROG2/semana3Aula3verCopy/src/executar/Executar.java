package executar;
import java.util.Scanner;
import aluno.Aluno;

public class Executar {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner ler = new Scanner (System.in);
		//parte para inserir matricula saltei.... preguica
		System.out.println("Insira o nome do aluno e a idade do mesmo");
		aluno.setNome(ler.next());
		aluno.setIdade(ler.nextShort());
		
		System.out.println("Insira as 3 notas do aluno"+aluno.getNome());
		
		
		for(int i = 0; i<aluno.getNota().length; i++) {
			
			System.out.println("Insira nota "+(i+1));
			aluno.setNota(i, ler.nextDouble());
			 	
		}
		//chamada do metodo mostrarMedia
		double mostraMedia = aluno.calcularMedia();
		
		System.out.println("O aluno obteve "+aluno.getNome()+" tem média "+mostraMedia);
		
		
	}
}
