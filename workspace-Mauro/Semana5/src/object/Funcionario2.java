package object;

public class Funcionario2 {
	//Funcionario vai ser a minha superclasse para o objecto Vendedor 
	private String nome, tipo_doc;
	private int num_doc;
	private double salario;

	//Este e o meu contrutor com todos os atributos da classe
	public Funcionario2(String nome, String tipo_doc, int num_doc, double salario) {
		this.nome = nome;
		this.tipo_doc = tipo_doc;
		this.num_doc = num_doc;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public int getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(int num_doc) {
		this.num_doc = num_doc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		return "------Dados do Funcionario-----\nNome:"+nome+"\nTipo de Documento:"+tipo_doc+"\nNumero de Documento:"+num_doc+"\nSalario:"+salario;
	}
}
