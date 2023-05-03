import java.util.Scanner;
public class ex2{
	public static Scanner ler=new Scanner(System.in);
	public static int V[]=new int [10];
	public static int contNegativo=0, somaP=0;
	public static void main(String [] args){
		System.out.println("Insira 10 nrs: ");
		
		for(int i=0;i<V.length;i++){
			V[i]=ler.nextInt();
			
			if(V[i]<0){
				contNegativo=contNegativo+1;
			}else{
				somaP=somaP+V[i];
			}
		}
		
		System.out.println("O conjunto tem "+contNegativo+" nrs negativos");
		System.out.println("A soma dos positivos e "+somaP);
	}
}