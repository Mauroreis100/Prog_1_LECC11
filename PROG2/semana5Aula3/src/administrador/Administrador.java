package administrador;
import funcionario.Funcionario;

public class Administrador extends Funcionario {
	private int horas;

	public double getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public Administrador() {}
	
	public Administrador(String nome, String tipoDoc, String numDoc, double salario, int horas) {
		super(nome, tipoDoc, numDoc, salario);
		
		this.horas = horas;
	}
	
	public double calcularSalario () {
		if(getHoras() > 0) {
			return ((getSalario()/100)*getHoras() + getSalario());
		}
		
		return getSalario();
		
	}
}
	
	
	

