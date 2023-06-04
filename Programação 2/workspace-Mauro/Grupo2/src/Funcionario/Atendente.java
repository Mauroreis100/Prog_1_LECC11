package Funcionario;

public abstract class Atendente extends Funcionario{

	public Atendente(String nome, double salario, double bonus, double desconto) {
		super(nome, salario, bonus, desconto);
		
	}

	public double CalcularPagamento(double salarioBase,double bonus,double desconto) {
	return salarioBase+bonus-salarioBase*0.08;
	}
	
	
}
