package vendedor;
import funcionario.Funcionario;

public class Vendedor extends Funcionario {
	private double comissaoVendas;
	
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
	
	
	public double calcularSalario() {
		//tirar 5% da commissao de vendas 
		
		return (getSalario()*0.05 + getSalario());
	}
	
	//fazer o mesmo metodo para calcular salario com percentagem de comissao variavel
	//sobrecarregar um metodo é reescrever, neste caso a difere
	public double calcularSalario(double percComissao) {
		return (getSalario()*percComissao + getSalario());
	}
	
	
}
