package funcionarios;
import funcionario.Funcionario;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(double salBase, double bonus) {
		super(salBase, bonus);
		this.salBase=5000;
		this.bonus=0.1;
	}
	 public double salario() {
			// TODO Auto-generated method stub
			return salBase+(salBase*bonus);
		}
}
