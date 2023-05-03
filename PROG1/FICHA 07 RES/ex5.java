import java.util.*;
public class ex5{
	public static int maior=0,maior1=0,posicao=0;
	public static Scanner ler=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Insira a quantidade de elementos que deseja: ");
		int n=ler.nextInt();
		
		int v[]=new int[n];
		
		preencher(v);
		mostrar(v);
		procurarMaior(v);
	
	}
	
	public static void preencher(int v[]){
		
		System.out.println("Preencha o vector: ");
		for(int i=0;i<v.length;i++){
			System.out.println("Insira o "+(i+1)+"o nr");
			v[i]=ler.nextInt();
		}
		
	}
	
	public static void mostrar(int v[]){
		System.out.println("O vector tem os seguintes nrs: "+Arrays.toString(v));
	}
	
	public static void procurarMaior(int v[]){
		maior=v[0];
		
		for(int i=1;i<v.length;i++){
			if(maior<v[i]){
				maior=v[i];
				posicao=posicao+1;
			}
		}
		
		System.out.print("O maior nr ="+maior+" e esta na posicao "+posicao);
		
	}
}