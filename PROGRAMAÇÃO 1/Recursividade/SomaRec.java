import java.util.Scanner;
	public class SomaRec{
		public static int soma(int n){
			if(n == 0){
				return 0;
			}else{
				return n + soma(n-1);
			}
		}
		public static void main(String args[]){
			Scanner scn = new Scanner(System.in);
			System.out.print("Insira o numero");
			int num = scn.nextInt();
			int res = SomaRec.soma(num);
			System.out.println("O resultado da soma e "+res);
		}
	}