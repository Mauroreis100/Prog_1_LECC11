package funcionario;

public class Funcionario {
	private String nome, tipoDoc, numDoc;
	private double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Funcionario(String nome, String tipoDoc, String numDoc, double salario) {
		
		this.nome = nome;
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
		this.salario = salario;
	}
	
	
	public Funcionario() {}
	
	public String toString() {
		return "Funcionario [nome=" + nome + ", tipoDoc=" + tipoDoc + ", numDoc=" + numDoc + ", salario=" + salario
				+ "]";
	}
	
	
	
}
