import java.util.Scanner;
public class metodosVoid{
	public static void main(String[]args){
//Aqui ira se executar os metodos
// Por exemplo, um metodo que ira dar boas vindas ao usuario
//chamarei o metodo de welcome, e para chama-lo sera assim welcome();
		welcome();
		multiply(5,6);
		multiply(6,6);
		multiply(7,5);
		divisao(4,3);

	}
	
		public static void welcome() {
			System.out.println("Welcome to my calculator");
		}
	
		public static void multiply(int x, int y) {
			System.out.println(x*y);
			
		}
		
		public static void divisao(double x,double y) {
			System.out.println(x/y);
		}
}