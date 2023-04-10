package objecto;

public class Funcionario {
	private String nome;
	private int numeroBi;
	private double salario;

	public Funcionario(String nome, int numeroBi, double salario) {
		this.nome = nome;
		this.numeroBi = numeroBi;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroBi() {
		return numeroBi;
	}

	public void setNumeroBi(int numeroBi) {
		this.numeroBi = numeroBi;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double bonus() {
		return salario*0.10;
	}

	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroBi=" + numeroBi + ", salario=" + salario + "]";
	}

}
