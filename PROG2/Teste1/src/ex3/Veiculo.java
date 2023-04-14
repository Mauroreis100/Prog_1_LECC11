package ex3;

public class Veiculo {
	private String marca, modelo;
	private int ano;
	private double preco;
	
	
	
	
	public Veiculo(String marca, String modelo, int ano, double preco) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
			
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + "]";
	}
	
	
	
	
	
	
}
