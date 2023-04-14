package ex4;

public abstract class Livro {
	
	private String titulo;
	private double precoCusto;
	private double margemLucro;
	

	public Livro(String titulo, double precoCusto, double margemLucro) {
	
		this.titulo = titulo;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}


	public double getMargemLucro() {
		return margemLucro;
	}


	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}




	public abstract void calcularPreco();
}
