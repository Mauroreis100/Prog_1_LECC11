package Casting;

public class Carro extends Veiculo{
	private int numPortas;
	
	public Carro(String nomeCondutor,String dataEntrada,String marca,String modelo,String matricula,int numPortas){
		super(nomeCondutor,dataEntrada,marca,modelo,matricula);
		this.numPortas=numPortas;
	}
}