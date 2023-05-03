import java.util.Scanner;
public class ex7{
	public static void main(String args[]){
		System.out.println("Insere o numero de elementos");
		int x= input.nextInt();
		int[] V= new int[x];
		int qun=0;
		res(V);
		impri(V);
		quantidade(V,qun);
		
	}
	public static Scanner input=new Scanner(System.in);
	public static void res(int[] V){
		System.out.println("Escreve cada elemento");
		for(int i=0;i<V.length;i++){
			V[i]= input.nextInt();
		}
	}
	public static void impri(int[] V){
		for(int i=0;i<V.length;i++){
			System.out.print(V[i]+" ");
		}
	}
	public static void quantidade(int[] V, int qun){
		System.out.println("Insira o numero o numero que aparece com mais frequencia");
		int y= input.nextInt();
		for (int i=0;i<V.length;i++){
			if(V[i]==y){
				qun+=1;
			}
		}
		System.out.println("A quantidade de repeticoes que houve foi "+qun);
	}
}
