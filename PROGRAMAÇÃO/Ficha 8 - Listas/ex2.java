import java.util.*;
public class ex2{
	public static Scanner ler=new Scanner(System.in);

	public static void main(String[] args){
	
		ArrayList<String>nome=new ArrayList<>();
		
		System.out.println("Insercao de texto: ");
		for(int i=0;i<3;i++){
			System.out.println("Insira o "+(i+1)+"o texto");
			nome.add(ler.nextLine());
		}
		System.out.println("Os nomes foram cadastrados na seguinte ordem: "+nome);
		System.out.println("Os nome na ordem inversa de cadastro: ");
		
		for(int i=nome.size()-1;i>=0;i--){
			System.out.print(nome.get(i)+" ");
		}
	}
}