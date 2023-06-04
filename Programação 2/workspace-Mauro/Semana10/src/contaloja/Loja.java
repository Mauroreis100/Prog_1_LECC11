package contaloja;

import java.util.Vector;

public class Loja implements Pagamento{ 
	protected Vector <Loja> v; //Recebe um aray de objectos do tipo Loja
	protected String nomeProd; //Nome do produto
	private double preco; 	  //Preço do procuto
	private Conta c; 		//Guarda objecto do tipo loja
	
	protected double totaVendas;
	
public Loja(String nomeProd, double preco) {
		this.nomeProd = nomeProd;
		this.preco = preco;
		this.totaVendas = 0;
	}
public Vector<Loja> getV() {
		return v;
	}
	public void setV(Vector<Loja> v) {
		this.v = v;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Conta getC() {
		return c;
	}
	public void setC(Conta c) {
		this.c = c;
	}
	public double getTotaVendas() {
		return totaVendas;
	}
	public void setTotaVendas(double totaVendas) {
		this.totaVendas = totaVendas;
	}
	/*
	public Loja(double valorTotal) {
		super(valorTotal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pagar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double valorPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}
	
*/
	@Override
	public boolean pagar(double valor) {
		// TODO Auto-generated method stub
		return c.sacar(valor);
	}
	@Override
	public double valorPagamento() {
		// TODO Auto-generated method stub
		for(int i=0;i<v.size();i++) {
			totaVendas=totaVendas+v.get(i).preco;
		}
		return totaVendas;
	}
	public double totalVendas() {
		return v.size();//Número de vendas realizadas
	}
}
