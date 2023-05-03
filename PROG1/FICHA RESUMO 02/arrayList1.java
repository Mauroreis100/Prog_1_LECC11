import java.util.*;
public class arrayList1{
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		ArrayList<String>nomes=new ArrayList<String>();
		System.out.println("Quantas cores deseja inserir: ");
		int n=ler.nextInt();
		
		System.out.println("Insira "+n+" cores: ");
		for(int i=0;i<n;i++){
			String cor=ler.next();
			
			if(!nomes.contains(cor)){
				nomes.add(cor);
			}	
		}
		Collections.sort(nomes);
		System.out.println("As cores inseridas pelo usuario sao: "+nomes);	
	}
}