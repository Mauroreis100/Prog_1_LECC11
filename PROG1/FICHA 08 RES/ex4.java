import java.util.*;
public class ex4{
	public static Scanner ler=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Quantos nrs pretende inserir: ");
		int n=ler.nextInt();
		
		ArrayList<Integer>valor;
		valor=new ArrayList<>();
		preencherArray(n,valor);
		System.out.print("A media dos valores "+valor+" = "+mostrarMedia(valor));
		
	}
	
	public static void preencherArray(int n,ArrayList<Integer>valor){
		
		for(int i=0;i<n;i++){
			System.out.println("Insira o "+(i+1)+"o valor");
			valor.add(ler.nextInt());
		}
		
	}
	
	public static double mostrarMedia(ArrayList<Integer>valor){
		double media=0;
		int soma=0;
		for(int i=0;i<valor.size();i++){
			soma=soma+valor.get(i);
		}
		media=soma/valor.size();
		return media;
	}
}