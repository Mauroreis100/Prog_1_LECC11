package ex1;
import java.util.Calendar;
public class Veiculo {
	
	private String nomeCondutor, marca, modelo, matricula,cor;
	private Calendar dataEntrada, dataSaida;
	
	public Veiculo(String nomeCondutor, String marca, String modelo, String matricula, String cor, Calendar dataEntrada, Calendar dataSaida) {
		 
		this.nomeCondutor = nomeCondutor;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.cor = cor;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public String getNomeCondutor() {return nomeCondutor;}
	public void setNomeCondutor(String nomeCondutor) {this.nomeCondutor = nomeCondutor;}

	public String getMarca() {return marca;}
	public void setMarca(String marca) {this.marca = marca;}

	public String getModelo() {return modelo;}
	public void setModelo(String modelo) {this.modelo = modelo;}

	public String getMatricula() {return matricula;}
	public void setMatricula(String matricula) {this.matricula = matricula;}

	public String getCor() {return cor;}
	public void setCor(String cor) {this.cor = cor;}

	public Calendar getDataEntrada() {return dataEntrada;}
	public void setDataEntrada(Calendar dataEntrada) {this.dataEntrada = dataEntrada;}
	
	public Calendar getDataSaida() {return dataSaida;}
	public void setDataSaida(Calendar dataSaida) {this.dataEntrada = dataSaida;}

	@Override
	public String toString() {
		return "Veículo: "+marca+ " "+modelo+". Proprientário: "+nomeCondutor+"\n";
	}
	
	
	
//Classe mae; Operacoes(Interfacce,);
	//cL
	
	
	
	
	
	
}
