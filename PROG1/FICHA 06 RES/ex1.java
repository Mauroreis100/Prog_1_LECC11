import java.util.Scanner;
public class ex1{
	public static Scanner ler=new Scanner(System.in);
	public static void main (String[] args){
		boolean resp=informarM();
		System.out.println("");
		System.out.println("O nr e positivo: ");
		System.out.print("resposta: "+resp);
	}
	
	public static boolean informarM(){
		System.out.println("Insira um nr: ");
		int n=ler.nextInt();
		
		if(n>0){
			return true;
		}else{
			return false;
		}
	}
}