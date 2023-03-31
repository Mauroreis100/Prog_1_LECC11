package exHerancaSubClasseEst;
import exHeranca.Pessoa;

public class Estudante extends Pessoa {
	
	private short anoEscolar;
	
	
	
	public short getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(short anoEscolar) {
		this.anoEscolar = anoEscolar;
	}

	void matricular() {}
	
	void estudar() {}
}
