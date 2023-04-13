package executar;
import livro.Livro;
import mouse.Mouse;
import produto.Produto;

public class Executar {
	public static void main(String[] args) {
		
		
		
		Produto carrinho1[] = new Produto [5];
		
		Produto livro = new Livro("Pep",234.3,"Shelton");
		Produto livro2 = new Livro("PEP",700,"Ungulani ba ka khosa");
		Produto livro3 = new Livro("Pep",900.2,"Paulina Chiziane");
		
		Produto mouse = new Mouse("Pep",100.3,"optico");
		Produto mouse2 = new Mouse("Pep", 23.2,"bluetooth");
		
		carrinho1 [0] = livro;
		carrinho1 [1] = livro2;
		carrinho1 [2] = livro3;
		carrinho1 [3] = mouse;
		carrinho1 [4] = mouse2;
		
		//System.out.println(mouse.getDescricao());
		for(int i = 0; i< carrinho1.length; i++) {
			System.out.println(carrinho1[i]);
		}
	
		
		
		
	
	}
}
