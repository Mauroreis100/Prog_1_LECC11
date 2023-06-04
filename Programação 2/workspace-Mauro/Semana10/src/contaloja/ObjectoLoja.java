package contaloja;

import java.util.Vector;

public abstract class ObjectoLoja implements Pagamento{
	protected double valorTotal;
	protected Vector <Loja> v; //Recebe um aray de objectos do tipo Loja
	protected String produto;
	private double preco;
	
 	
	public ObjectoLoja(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
