package ex4;

public class Execucao {
	public static void main(String[] args) {
		LivroDeNaoFiccao l1 = new LivroDeNaoFiccao("Ualalapi",1500,0.2);
		l1.calcularPreco();
		
		LivroDeFiccao l2 = new LivroDeFiccao("Harry Potter", 200, 0.3);
		l2.calcularPreco();
	}
}
