package vendedor;
import funcionario.Funcionario;


public class Vendedor extends Funcionario {
	private double comissaoVendas;
	
	//O construtor da sublcasse é diferente do construtor da superclasse
	
	public double getComissaoVendas() {
		return comissaoVendas;
	}
	
	public void setComissaoVendas(double comissaoVendas) {
		this.comissaoVendas = comissaoVendas;
	}
	
	//
	//construtor a sublclasse- deve- se colocar os atributos da superclasse da propria classe
	public Vendedor(String nome, String tipoDoc, String numDoc, double salario, double comissaoVendas) {
		super(nome, tipoDoc, numDoc, salario);
		
		this.comissaoVendas = comissaoVendas;
	}
	
	
		//toString da subclasse
	
	public String toString() {
		return super.toString() + "comissaoVendas " + comissaoVendas;
	}
	
	
	public void imprimir() {
		System.out.println(comissaoVendas);
	}
	
	public void imprimir(String msg) {
		System.out.println(msg+comissaoVendas);
	}

}
