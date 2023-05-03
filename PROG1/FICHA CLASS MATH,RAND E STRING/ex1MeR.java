import java.util.Scanner;
import java.util.ArrayList;
public class ex1MeR{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> Nomes = new ArrayList();
		for (int i=0;i<5;i++){
			System.out.print("Digite o nome "+(i+1)+" que deseja adcionar na lista:");
			String nome = teclado.nextLine();
			Nomes.add(nome);
		}
		for (int i=Nomes.size()-1;i>=0;i--){
			System.out.print(Nomes.get(i)+" ");
		}
	}
}

