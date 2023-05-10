package ex3;

public class Designer extends Funcionario  {

	public Designer(String nome, double salarioBase) {
		super(nome, salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalarioB() {
		// TODO Auto-generated method stub
		return (super.getSalarioBase())+0.15*super.getSalarioBase();
	}

}
