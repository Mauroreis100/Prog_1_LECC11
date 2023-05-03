import java.util.Scanner;
public class mdc{
	
	public static void main(String[]args){
		System.out.println("Insira dois nrs: ");
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		System.out.println("O maximo divisor comum (mdc) entre "+x+" e "+y+" = "+Acharmdc(x,y));
	}
	
	public static int Acharmdc(int x, int y) {
		if (y==0	) {
			return Acharmdc(y,x);
		}
		else if(x%y == 0){
			return y;
		}else{
			return Acharmdc(y, x%y);
		}
	}
}