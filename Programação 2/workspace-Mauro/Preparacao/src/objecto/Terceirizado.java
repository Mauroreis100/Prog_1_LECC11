package objecto;

public class Terceirizado  extends Funcionarios{
 private double valorServicos;
 /*1- Fez-se a inicialização 
	 * do atributo no construtor*/
	
	//Active caso não herde os métodos e atributos
//1. public Terceirizado(double valorServicos) {
 public Terceirizado(String nome, int id, double salario ,double valorServicos) {
		super(nome,id,salario);
 this.valorServicos=valorServicos;
 }
 
 
 public double getValorServicos() {
	return valorServicos;
}


public void setValorServicos(double valorServicos) {
	this.valorServicos = valorServicos;
}


public double calcularSalario() {
		return super.getSalario()+valorServicos*0.2;
	} 
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ", Salário plus= "+calcularSalario();
	}
}
