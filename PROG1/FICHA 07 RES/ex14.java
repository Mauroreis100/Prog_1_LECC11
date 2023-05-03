import java.util.Arrays;
public class ex14{
	public static Scanner ler=new Scanner(System.in);
	public static int V[]=new int[12];
	public static int a=0,b=1;
	
	public static void main(String[]args){
		for(int i=0;i<V.length;i++){
			a=a+b;
			b=a-b;
			V[i]=b;
		}
		mostrarV(V);	
	
	}
	
	public static void mostrarV(int V[]){
		System.out.println("Fibonacci: "+Arrays.toString(V));
	}
}