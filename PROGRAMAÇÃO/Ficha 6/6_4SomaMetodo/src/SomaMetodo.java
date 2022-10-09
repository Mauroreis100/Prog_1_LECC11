import java.util.Scanner;

public class SomaMetodo {
	public static int SomaImpares() {
		int soma=0;
		for(int i=30;i>0;i--) {
			if(i%2==1) {
				soma+=i;
			}
		}
		return soma;
	}
	public static long ProdutoPares() {
		long produto=1;
		for(int i=30;i>0;i--) {
			if(i%2==0) {
				produto*=i;
			}
		}
		return produto;
	}
	public static void main(String[] args) {

			System.out.println("A soma de números ímpares de 0 a 30 é igual a "+SomaImpares());
			System.out.println("A multiplicação de números pares de 0 a 30 é igual a "+ProdutoPares());
	}

}
