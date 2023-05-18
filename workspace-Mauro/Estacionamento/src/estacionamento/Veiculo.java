package estacionamento;

import java.util.Date;

public class Veiculo {

	private String nomeCondutor, marca, modelo, matricula, cor;
	private Date dataEntrada;

	public Veiculo(String nomeCondutor, String marca, String modelo, String matricula, String cor, Date dataEntrada) {
		this.nomeCondutor = nomeCondutor;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.cor = cor;
		this.dataEntrada = dataEntrada;
	}

	public String getNomeCondutor() {
		return nomeCondutor;
	}

	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do Condutor";
	}

}
