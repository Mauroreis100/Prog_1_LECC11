package funcionario;
import implementar.Salario;
public abstract class Funcionario implements Salario{
	protected double salBase=0;
	protected double bonus;

	public Funcionario(double salBase, double bonus) {
		this.salBase = salBase;
		this.bonus = bonus;
	}
	public double getSalBase() {
		return salBase;
	}
	public void setSalBase(double salBase) {
		this.salBase = salBase;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
