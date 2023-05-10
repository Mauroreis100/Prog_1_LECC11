package funcionarios;
import funcionario.Funcionario;

public class Gerente extends Funcionario{

	public Gerente(double salBase, double bonus) {
		super(salBase, bonus);
		this.salBase=10000;
		this.bonus=0.2;
		// TODO Auto-generated constructor stub
	}

	
	 public double salario() {
		// TODO Auto-generated method stub
		return salBase+(salBase*bonus);
	}
}
