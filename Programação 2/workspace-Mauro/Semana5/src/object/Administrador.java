package object;

public class Administrador extends Funcionario2{
	private double horas;
	public Administrador(String nome, String tipo_doc, int num_doc, double salario, int horas) {
		super(nome, tipo_doc, num_doc, salario);
		this.horas=horas;
		// TODO Auto-generated constructor stub
	}
	
	public double calculaSalario() {
		return getSalario()+(getSalario()/100)*horas;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nDas "+horas+"h trabalhadas o Administrador recebe: "+calculaSalario();
		
	}
	
	
}
