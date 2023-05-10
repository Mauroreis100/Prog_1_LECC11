package ex3;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, double salarioBase) {
		super(nome, salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalarioB() {
		// TODO Auto-generated method stub
		return (super.getSalarioBase())+0.1*super.getSalarioBase();
	}
	

}
