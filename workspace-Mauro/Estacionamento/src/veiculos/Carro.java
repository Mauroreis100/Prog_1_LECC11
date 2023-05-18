package veiculos;

import java.util.Date;

import estacionamento.Veiculo;

public class Carro extends Veiculo{
private int nrDePortas;
	public Carro(String nomeCondutor, String marca, String modelo, String matricula, String cor, Date dataEntrada,
			int nrDePortas) {
		super(nomeCondutor, marca, modelo, matricula, cor, dataEntrada);
		this.nrDePortas=nrDePortas;
		// TODO Auto-generated constructor stub
	}
	public int getNrDePortas() {
		return nrDePortas;
	}
	public void setNrDePortas(int nrDePortas) {
		this.nrDePortas = nrDePortas;
	}




}
