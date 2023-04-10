package funcionario;

public class Funcionario {
	private String nome;
	private String tipo_doc;
	private int num_doc;
	private int salario;
	
	public Funcionario(String nome, String tipo_doc, int num_doc, int salario) {
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
	public void setSexo(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public int getNum_doc() {
		return num_doc;
	}
	public void setNum_doc(int num_doc) {
		this.num_doc = num_doc;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Funcionario " + nome + " com o " + tipo_doc + " de numero: " + num_doc + " tem um salario de: "+salario;
	}
	
}
