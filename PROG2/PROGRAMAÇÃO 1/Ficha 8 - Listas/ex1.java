import java.util.*;
public class ex1{
	public static Scanner ler=new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Quantos nomes deseja inserir na lista: ");
		int n=ler.nextInt();
		
		ArrayList<String>nome=new ArrayList<>();
		
		System.out.println("Insercao de nomes: ");
		for(int i=0;i<n;i++){
			System.out.println("Insira o "+(i+1)+"o nome");
			nome.add(ler.next());
		}
		System.out.println("Os nomes foram cadastrados na seguinte ordem: "+nome);
		System.out.println("Os nome na ordem inversa de cadastro: ");
		
		for(int i=nome.size()-1;i>=0;i--){
			System.out.print(nome.get(i)+" ");
		}
	}
}