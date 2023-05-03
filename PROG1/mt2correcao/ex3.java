import java.util.*;

public class ex3{
	public static Scanner ler=new Scanner(System.in);
	public static int n;
	public static void main(String[] args){
		
		System.out.println("Insira a quantidade de contactos que pretende inserir: ");
		int n=ler.nextInt();
		String V[]=new String[n];
		String nrs[]=new String[n];
		
		preencherV(V,nrs);
		pesquisar(V,nrs);
	
	}
	public static void preencherV(String V[], String nrs[]){
		
		for(int i=0;i<V.length;i++){
			System.out.println("Insira o "+(i+1)+"o contacto, nome : ");
			V[i]=ler.next();
			System.out.println("Insira o nr de "+V[i]);
			nrs[i]=ler.next();
		}
		
		System.out.println("Inseracao de dados concluida: ");
	}
	
	public static void pesquisar(String V[], String nrs[]){
		int pesq=1;
		String mensagem="Nao existe esse nome!";
		String nomeInserido;
		while(pesq==1){
			System.out.println("Insira o nome da pessoa para obter o numero: ");
			nomeInserido=ler.next();
			
			for(int i=0;i<V.length;i++){
				if(V[i].equalsIgnoreCase(nomeInserido)){
					mensagem= nrs[i];
					
				}
			}
			System.out.println("Resultado: "+mensagem+" ");
			pesq=0;
			System.out.println("Para continuar a pesquisa insira 1: ");
			pesq=ler.nextInt();
			
			
		}
		
	}
}