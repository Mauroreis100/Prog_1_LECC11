import java.util.*;
	public class MediaList {
		Scanner ler= new Scanner(System.in);
		public static void main(String[]args){
			System.out.print("Quantos numeros deseja inserir:");
			int n=ler.nextInt();
			ArrayList<Integer> L;
			L=new ArrayList<>();
			for(int i=0; i<n; i++) {
				System.out.println("Insira o "+(i++)+"o valor");
				L.add(ler.nextInt());
			}	
			System.out.println("A media dos valores"+L+"="+mostraMedia(L));
		}
		public static double mostraMedia(ArrayList<> Integer L) {
			double media=0;
			int soma=0;
			for(int i =0; i<L.size();i++) {
				soma=soma+L.get(i);
				
			}
			media=soma/L.size();
			return media;
		}
	}