import java.util.Scanner;
public class ex4{
	
	public static int V[]=new int[5];
	public static int menor;
	public static int menor1;
	public static int maior;
	public static int maior1;
	public static int soma=0;
	public static double media=0;
	public static Scanner ler=new Scanner(System.in);
	
	public static void main(String[] args){
		preencherV(V);
		maior1=acharmaior(V);
		menor1=acharmenor(V);
		
			for(int i=0;i<V.length;i++){
			if(V[i]!=menor1 && V[i]!=maior1){
				soma=soma+V[i];
			}	
			}
		media=(soma)/3;
		System.out.println("A media das notas: ");
			for(int i=0;i<V.length;i++){
				System.out.print(V[i]+", ");
			}
		System.out.print("");
		System.out.println("excluindo "+menor1+" e "+maior1+" ="+media);
		
	}	
		
		public static void preencherV(int [] V){
			System.out.println("Preencha com 5 nrs: ");
			for(int i=0;i<V.length;i++){
				V[i]=ler.nextInt();
			}
		}
		
		public static int acharmaior(int V[]){
			maior=V[0];
			
			for(int i=0;i<V.length;i++){
				if(V[i]>maior){
					maior=V[i];
				}
			}
			return maior;
		}
		
		public static int acharmenor(int V[]){
			menor=V[0];
			
			for(int i=0;i<V.length;i++){
				if(V[i]<menor){
					menor=V[i];
				}
			}
			return menor;
		}		
		
		
		
		
		
		
	
	
}
