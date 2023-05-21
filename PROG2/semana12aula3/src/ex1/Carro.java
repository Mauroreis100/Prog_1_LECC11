package ex1;

import java.util.Calendar;

public class Carro extends Veiculo{

	private short numPortas;
	
	public int getNumPortas() {return numPortas;}
	public void setNumPortas(short numPortas) {this.numPortas = numPortas;}

	public Carro(String nomeCondutor, String marca, String modelo, String matricula, String cor, Calendar dataEntrada, Calendar dataSaida, short numPortas) {
		super(nomeCondutor, marca, modelo, matricula, cor, dataEntrada, dataSaida);
		this.numPortas = numPortas;
		// TODO Auto-generated constructor stub
	}
	
	//to string com numero de portas
}
