import java.util.Scanner;
	public class MdcRec{
		public static int euclides(int a, int b){
			if(b == 0){
				return a;
			}else{
				return euclides(b,a % b);
			}
		}
		public static void main(String [] args){
			Scanner ler = new Scanner(System.in);
			System.out.print("Insira o primeiro num:");
			int a = ler.nextInt();
			System.out.println("Insira o segundo num:");
			int b = ler.nextInt();
			int res = MdcRec.euclides(a,b);
			System.out.println("Mdc = " +res);
		}
	}