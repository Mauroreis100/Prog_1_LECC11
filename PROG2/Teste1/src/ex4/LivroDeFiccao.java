package ex4;

public class LivroDeFiccao extends Livro{

	
	

	public double getMargemLucro() {
		return 0.3;
	}
	
	
	public LivroDeFiccao(String titulo, double precoCusto, double margemLucro) {
		super(titulo, precoCusto, margemLucro);
	
	}


	public void calcularPreco() {
		
		this.setPrecoCusto(this.getPrecoCusto()+(this.getPrecoCusto()*this.getMargemLucro()));
		System.out.println("O preco é "+this.getPrecoCusto());
	}

}
