package object;

public class Vendedor extends Funcionario2 {
	/*
	 * Da erro pois ele diz que so tem 1 atributo, mas na verdade tem 6,da
	 * instancia(superclasse) so depois os locais , o contrutor da subclasse nunca e
	 * igual ao da superclasse Temos de colocar os atributos locais no construtor
	 */

	// Tem um atributo chamado comissao de vendas com 5%
	private double comissao;

	/*
	 * Tenho de levar estes atributos para a super classe Entregando todos os
	 * parametros a superclasse Tenho de seguir a mesma sequencia invocando o
	 * contrutor da superclasse super()
	 */

	public Vendedor(String nome, String tipo_doc, int num_doc, double salario, double comissao) {
		// Contrutor da subclassse
		super(nome, tipo_doc, num_doc, salario);
		this.comissao = comissao;

	}

//5% Salario + 5%
	// public double getComissao() {
	// return getSalario()+((comissao/100)*getSalario());
	/*
	 * Devia ser comissao de todas as vendas E contas de todas as vendas que faz e
	 * diminuir 5%
	 * 
	 */
	// }
	public double calculaSalario() {
		/*
		 * Fez vendas equivalente a 20000 entao dos 20000 tiramos 5% e entregamos ao
		 * salario
		 */
		return getSalario() + comissao * 0.05;
	}

//Overriding comissao
	public double calculaSalario(double percentagem) {
		/*
		 * Fez vendas equivalente a 20000 entao dos 20000 tiramos 5% e entregamos ao
		 * salario
		 */
		return getSalario() + comissao * (percentagem / 100);
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String toString() {
		// return super.toString() + "\nComissao de Vendas: " + comissao+"\nSalario +
		// Comissao: "+calculaSalario();

		return super.toString() + "\nComissao de Vendas: " + comissao + "\nSalario + Comissao: " + calculaSalario()
				+ "\nComissao variavel:" + calculaSalario(40);
	}

	public void imprimir() {
		System.out.println(comissao);
	}

	/*
	 * public void imprimir(String msg) { System.out.println(msg + " " + comissao);
	 * }
	 */

}
