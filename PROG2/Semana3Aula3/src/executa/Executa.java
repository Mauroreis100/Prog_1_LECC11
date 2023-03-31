package executa;
import aluno.Aluno;
import java.util.Scanner;

public class Executa {
	public static void main(String[] args) {
		double sumNota=0, media;
		Aluno aluno= new Aluno();
		
		//Aluno nota = new Aluno();
		
		Scanner ler=new Scanner(System.in);
		
		//Para receber o nome do aluno no objecto segue-se o exemplo abaixo
		//v1.setColor("Red");
		
		System.out.println("Insira o nome do aluno: ");
		aluno.setNome(ler.next());
		
		System.out.println("Insira as 3 notas do aluno"+aluno.getNome());
		
		
		
		for(int i=0;i<3;i++) {
			aluno.setNota(ler.nextInt());
			sumNota+=aluno.getNota();
		}
		//Criar metodo para calcular media
		media=sumNota/3;
		
		if(media>=7) {
			System.out.println("O aluno "+aluno.getNome()+" foi aprovado com media "+media);
			}else {
				System.out.println("O aluno "+aluno.getNome()+" foi reprovado com media "+media);
			}
			
		
		
		
	}
}
