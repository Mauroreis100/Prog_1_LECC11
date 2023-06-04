package objectoImovelMovel;

public class Velho extends Imovel{
private double desconto;
	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto=desconto;
		// TODO Auto-generated constructor stub
	}
	public double getdesconto() {
		return desconto;
	}
	public void setdesconto(double desconto) {
		this.desconto = desconto;
	}
	public double subtracao() {
		return super.getPreco()-super.getPreco()*(desconto/100);
	}
	@Override
	public String toString() {
		return super.toString()+"Novo [desconto=" + desconto + "\nTotal: "+subtracao()+"]\n";
	}
	
}
