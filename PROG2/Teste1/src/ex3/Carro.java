package ex3;

public class Carro extends Veiculo {
	
	private short qtdPortas;

	public Carro(String marca, String modelo, int ano, double preco, short qtdPortas) {
		super(marca, modelo, ano, preco);
		this.qtdPortas = qtdPortas;
	}

	public short getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(short qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	
	public String toString() {
		return super.toString()+"Carro [qtdPortas=" + qtdPortas + "]";
	}

	
	
}
