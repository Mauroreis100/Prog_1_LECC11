package object;

public class Velho extends Imovel{
private double desconto;

public double getDesconto() {
	return desconto;
}

public void setDesconto(double desconto) {
	this.desconto = desconto;
}

public String toString() {
	return "Velho [desconto=" + desconto + "]";
}


}
