import java.util.Scanner;
	public class PotenRec {
		public static int potencia(int k, int n) {
			if(n==0) {
				return 1;
			
			} else {
				int aux=potencia(k,n/2);
				if(n%2 ==0) {
					return aux*aux;
				}else{
					return aux*aux*k;
				}
			}
		}
		public static void main(String args[]) {
			Scanner ler= new Scanner(System.in);
			System.out.print("insira o valor da base");
			int c=ler.nextInt();
			System.out.println("insira o valor do expoente");
			int d=ler.nextInt();
			System.out.println(potencia(c,d));
		}
	}