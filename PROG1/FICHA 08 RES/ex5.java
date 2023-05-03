import java.util.*;
public class ex5{
	public static Scanner ler=new Scanner(System.in);
	public static int n;

	public static void main(String[] args){
		System.out.println("Boas-vindas: ");	
		
		System.out.println("Insira a quantidade dos nrs que pretend inserir na lista: ");
		n=ler.nextInt();
		
		ArrayList<Double>numero=new ArrayList<>(n);
		
		for(int i=0;i<n;i++){
			System.out.println("Insira o "+(i+1)+"o numero");
			numero.add(ler.nextDouble());
		}
		System.out.println("A lista e composta pelos nrs: "+numero);
		int escolha=0;
		System.out.println("Para inserir um nr adicionar: 1");
		System.out.println("Para pesquisar selecione: 2");
		System.out.println("Para modificar selecione: 3 ");
		System.out.println("Para remover selecione: 4 ");
		escolha=ler.nextInt();
		
		int p=0;
		while(p==0){
			switch(escolha){
				case 1:
					adicionarN(numero,escolha);
					break;
				case 2:
					pesquisarN(numero,escolha);
					break;
				case 3:
					modificarN(numero,escolha);
					break;
				case 4:
					removerN(numero,escolha);
					break;
				default:
					System.out.println("Insira outra opcao: ");
					break;
			}
				System.out.println("Digite 0 para fazer outra operacao ou 1 para terminar ");
				p=ler.nextInt();
				if(p==0){
					System.out.println("Para inserir um nr adicionar: 1");
					System.out.println("Para pesquisar selecione: 2");
					System.out.println("Para modificar selecione: 3 ");
					System.out.println("Para remover selecione: 4 ");
					escolha=ler.nextInt();
				}	
		}
		
	}
	
	public static void adicionarN(ArrayList<Double>numero,int escolha){
		System.out.println("Insira o nr que pretende adicionar a lista: ");
		numero.add(ler.nextDouble());
		System.out.println("A lista atualizada: "+numero);
	}
	
	public static void pesquisarN(ArrayList<Double>numero,int escolha){
		System.out.println("Insira o numero que pretende pesquisar ");
		int nr=+numero.indexOf(ler.nextDouble());
		if(nr!=-1){
			System.out.println("O nr inserido esta na posicao:"+nr);
		}else{
			System.out.println("O nr nao existe ");
		}
	}
	
	public static void modificarN(ArrayList<Double>numero,int escolha){
		System.out.println("Insira a posicao do nr que pretende modificar e o nr: ");
		numero.set(ler.nextInt(),ler.nextDouble());
		System.out.println("Lista atualizada: "+numero);
		
	}
	
	public static void removerN(ArrayList<Double>numero,int escolha){
		System.out.println("Insira o numero que pretende remover da lista: ");
		numero.remove(ler.nextDouble());
		System.out.println("Lista atualizada: "+numero);
	}
	
}