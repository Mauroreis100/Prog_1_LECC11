package funcionario;

//import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {
	private double comissao_vendas;

	public Vendedor(String nome, String tipo_doc, int num_doc, int salario, double comissao_vendas) {
		super(nome, tipo_doc, num_doc, salario);
		this.comissao_vendas = comissao_vendas;
	}

	public double getComissao_vendas() {
		return comissao_vendas;
	}

	public void setComissao_vendas(double comissao_vendas) {
		this.comissao_vendas = comissao_vendas;
	}
	
	public void imprimir() {
		System.out.println(comissao_vendas);
	}
	public void imprimir(String mensagem) {
		System.out.println(mensagem +" "+comissao_vendas);
	}
	
	public double vendas (int numero_vendas) {
		
		double valor = 0;
		
		for (int i = 0; i < numero_vendas; i++) {
			//valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto:"));
			comissao_vendas = comissao_vendas + (valor * 5 / 100);
		}
		setSalario(getSalario() + (int)comissao_vendas);
		return comissao_vendas;
	}
	
	public String toString() {
		return super.toString() +" mais uma comissão de vendas de: "+comissao_vendas;
	}
}
