package objectoImovelMovel;

public class Novo extends Imovel{
private double precoAdicional;
	public Novo(String endereco, double preco, double precoAdicional) {
		super(endereco, preco);
		this.precoAdicional=precoAdicional;
		// TODO Auto-generated constructor stub
	}
	public double getPrecoAdicional() {
		return precoAdicional;
	}
	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}
	public double adicao() {
		return precoAdicional+super.getPreco();
	}
	@Override
	public String toString() {
		return super.toString()+"Novo [precoAdicional=" + precoAdicional + "\nTotal: "+adicao()+"]\n";
	}
	

}
