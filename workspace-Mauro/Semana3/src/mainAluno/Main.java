package mainAluno;
import aluno.Aluno;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno=new Aluno();
		Scanner ler=new Scanner(System.in);
		System.out.println("Código de Matrícula: ");
		aluno.setMatricula(ler.nextInt());
		System.out.println("Nome: ");
		aluno.setNome(ler.next());
		System.out.println("Idade: ");
		aluno.setIdade(ler.nextShort());
		System.out.println("Nota 1: ");
		aluno.setNota1(ler.nextDouble());
		System.out.println("Nota 2: ");
		aluno.setNota2(ler.nextDouble());
		System.out.println("Nota 3: ");
		aluno.setNota3(ler.nextDouble());
		System.out.println(aluno.toString());
	}

}
