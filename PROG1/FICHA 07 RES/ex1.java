import java.util.Scanner;
public class ex1{
	public static Scanner ler=new Scanner(System.in);
	public static int V[]=new int[10];
	public static int contP=0,contImp=0;
	
	public static void main(String args[]){
		System.out.print("Insira 10 numeros: \n");
		for(int i=0;i<V.length;i++){
			System.out.println("Insira o "+(i+1)+"o nr");
			V[i]=ler.nextInt();
		}
		
		System.out.println("O conjunto tem "+contarPares(V)+" nrs pares");
		listarPares(V);
		
		System.out.println("O conjunto tem "+contarImpares(V)+" nrs impares");
		listarImp(V);
	}
	
	public static int contarPares(int [] V){
		
		for(int i=0;i<V.length;i++){
			if(V[i]%2==0){
				contP=contP+1;
			}
		}
		return contP;
	}
	
	public static void listarPares(int [] V){
		System.out.println("O conjunto tem os seguintes pares: ");
		
		for(int i=0;i<V.length;i++){
			if(V[i]%2==0){
			System.out.println(V[i]);
			}
		}
		
		
	}
	public static int contarImpares(int [] V){
		for(int i=0;i<V.length;i++){
			if(V[i]%2==1){
				contImp=contImp+1;
			}
		}
		return contImp;
	}
	
	public static void listarImp(int [] V){
		System.out.println("O conjunto tem os seguintes impares: ");
		for(int i=0;i<V.length;i++){
			if(V[i]%2==1){
			System.out.println(V[i]);
			}
		}	
	}
}