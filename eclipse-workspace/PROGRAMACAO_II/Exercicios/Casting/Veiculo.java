package Casting;

import java.util.Date;

public abstract class Veiculo {
		
	private String nomeCondutor;
	private Date dataEntrada;
	private String marca;
	private String modelo;
	private String matricula;	
		
	//Construtor
	public Veiculo(String nomeCondutor,Date dataEntrada,String marca,String modelo,String matricula){
		this.nomeCondutor=nomeCondutor;
		this.dataEntrada=dataEntrada;
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
	}
	
	//Metodos
}
