import java.util.Scanner;

public class ClassificacaoAluno {
	public static Scanner ler = new Scanner(System.in);

	public static double soma() {
		double soma;
		System.out.println("Insira as 3 notas");
		double nota1 = ler.nextDouble();
		double nota2 = ler.nextDouble();
		double nota3 = ler.nextDouble();
		soma = nota1 + nota2 + nota3;
		return soma;
		
	}

	public static double media() {
		double media = soma() / 3;
		return media;
	}

	public static void Desempenho() {
		double media=media();
		if (media >= 18) {
			System.out.println("Excelente");
		} else if (media >= 14 && media<= 17) {
			System.out.println("Muito Bom");
		} else if (media>= 12 && media<= 13) {
			System.out.println("Bom");
		} else if (media>= 10 && media<= 11) {
			System.out.println("Suficiente");
		} else if (media< 10) {
			System.out.println("Mau");
		}
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desempenho();
	}

}
