package Funcionario;

public abstract class Gerente extends Funcionario {

	public Gerente(String nome, double salario, double bonus, double desconto) {
		super(nome, salario, bonus, desconto);
	}
	
	public double CalcularPagamento(double salarioBase,double bonus,double desconto) {
		return salarioBase+salarioBase*0.2-salarioBase*0.1;
		}
	public String toString() {
		return super.toString()+" Gerente";
	}
}
