package objecto;

public class Efetivo extends Funcionarios{
	private double bonusAnual;
	/*1- Fez-se a inicialização 
	 * do atributo no construtor*/
	
	//Active caso não herde os métodos e atributos 
	//1. public Efetivo(double bonusAnual) {
	public Efetivo(String nome, int id, double salario ,double bonusAnual) {
		super(nome,id,salario);
		this.bonusAnual=bonusAnual;
	}
	
	public double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}

	public double calcularSalario() {
	//setBonusAnual super.getSalario()*0.01;
		return super.getSalario()+super.getSalario()*0.01;
	} 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ", Salário plus= "+calcularSalario();
	}

}
