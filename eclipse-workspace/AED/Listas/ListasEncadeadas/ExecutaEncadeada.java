package ListasEncadeadas;

public class ExecutaEncadeada {

	public static void main(String[] args) {
		
		
		ListaLigada lista = new ListaLigada();
		
		//Adicionar elementos
		lista.adicionar("Maputo");
		lista.adicionar("Gaza");
		lista.adicionar("Inhambane");
		lista.adicionar("Sofala");
		
		//Saber o tamnaho da lista
		System.out.println("Tamanho da lista "+lista.getTamanho());
		
		//Imprimir o primeiro e o ultimo valor
		System.out.println("Primeiro valor: "+lista.getPrimeiro().getValor());
		System.out.println("Ultimo valor: "+lista.getUltimo().getValor());
		
		//Imprimir valor numa posicao especifica
		System.out.print(lista.get(0).getValor()+" ");
		System.out.print(lista.get(1).getValor()+" ");
		System.out.print(lista.get(2).getValor()+" ");
		System.out.println(lista.get(3).getValor()+" ");
		
		//remover gaza
		lista.remover("Gaza");
		System.out.println("Removeu Gaza!");
		
		lista.adicionar("Tete");
		System.out.println("A lista foi atualizada!");
		for(int i=0;i<lista.getTamanho();i++) {
			System.out.print(lista.get(i).getValor()+" ");
		}
	}

}
