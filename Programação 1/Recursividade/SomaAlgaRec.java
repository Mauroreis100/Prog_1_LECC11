import java.util.Scanner;
	public class SomaAlgaRec{
		public static int somar(int num){
			if(num < 10){
				return num;
			}else{
				return somar(num/10)+num%10;
			}
		}
		public static void main(String [] args){
			Scanner ler = new Scanner(System.in);
			System.out.print("Insira o numero");
			int num = ler.nextInt();
			int res = SomaAlgaRec.somar(num);
			System.out.println("O resultado e "+ res);
			
		}
	}