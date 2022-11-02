import java.util.*;
public class ex9{
	public static Scanner ler=new Scanner(System.in);
	public static void main(String[] args){
		ArrayList<String>lista=new ArrayList<String>();
		
		lista.add("Programacao I");
		lista.add("Tecnicas de Comunicacao");
		lista.add("Fisica II");
		lista.add("Electronica Digital");
		lista.add("Teoria de Circuitos");
		
		System.out.println("A lista contem as seguintes disciplinas: "+lista);
		System.out.println("");
		
		System.out.println("Para eliminar um disciplina insira: ");
		System.out.println("0 para Programacao");
		System.out.println("1 para Tecnicas de Comunicacao");
		System.out.println("2 para Fisica II");
		System.out.println("3 para Electronica Digital");
		System.out.println("4 Para Teoria de Circuitos");
		
		lista.remove(ler.nextInt());
		
		System.out.println("Depois de remover a lista passou a ter os seguintes elementos: "+lista);
	}
}