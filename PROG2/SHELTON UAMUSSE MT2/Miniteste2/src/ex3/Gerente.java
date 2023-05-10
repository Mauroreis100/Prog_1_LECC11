package ex3;

public class Gerente extends Funcionario{

	
	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalarioB() {
		// TODO Auto-generated method stub
		return (super.getSalarioBase())+0.2*super.getSalarioBase();
	}

}
