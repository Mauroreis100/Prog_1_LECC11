package object;

public class  Novo extends Imovel{
 private double adicional;

public double getAdicional() {
	return adicional;
}

public void setAdicional(double adicional) {
	this.adicional = adicional+getPreco();
}

public String toString() {
	return "Novo [adicional=" + adicional + "]";
}
 
}
