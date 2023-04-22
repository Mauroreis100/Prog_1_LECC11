package Funcionario;

public abstract class Vendedor extends Funcionario {
	protected double vendas;
	public Vendedor(String nome, double salario, double bonus, double desconto, double vendas) {
		super(nome, salario, bonus, desconto);
		this.vendas = vendas;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double CalcularPagamento(double salarioBase, double vendas, double desconto) {
		return salarioBase+vendas*0.1-salarioBase*0.05;
		}
	
	public String toString() {
		return super.toString()+ " Vendedor";
	}
	
		
}
