package ex3;

public class Locadora extends Carro {
	
	
	//public Locadora(){}
	
	public Locadora(String marca, String modelo, int ano, double preco, short qtdPortas) {
		super(marca, modelo, ano, preco, qtdPortas);
	}

	public short getQtdPortas() {
		
		return super.getQtdPortas();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Locadora [getQtdPortas()=" + getQtdPortas() + ", toString()=" + super.toString()
				+ "\nValor alugar: ";
	}

	public double alugar (Veiculo veiculo, double diaria, int dias) {
		
		
		if(super.getQtdPortas() > 2) {
			return ( 500+ ( dias * diaria ) );
		}
		
				
		return (dias * diaria);
	}

}
