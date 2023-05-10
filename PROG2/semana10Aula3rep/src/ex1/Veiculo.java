package ex1;

public abstract class Veiculo {
	
	private int velocidade=0;
	
	
	
	public Veiculo(int velocidade) {
		super();
		this.velocidade = velocidade;
	}

	public Veiculo( ) {
	
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public abstract  void acelerar();
	
	public abstract  int frear();
}
