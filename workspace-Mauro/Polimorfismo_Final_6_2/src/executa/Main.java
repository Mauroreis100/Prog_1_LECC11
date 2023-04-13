package executa;

import objecto.*;

public class Main {
	public static void main(String[] args) {
		
		Produto carrinho[]=new Produto[5];
		carrinho[0]=new Mouse("Matola Supermarket",200,"Wireless");
		carrinho[1]=new Mouse("Matola Supermarket",400,"Com fio");
		carrinho[2]=new Mouse("Matola Supermarket",500,"Hibrído");
		carrinho[3]=new Livro("Matola Supermarket",140,"Mia Couto");
		carrinho[4]=new Livro("Matola Supermarket",140,"José Craveirinha");
//Imprime a descrição
		for(int i=0;i<carrinho.length;i++) {
			System.out.println(carrinho[i].getDescricao());
		}
		
	}
}
