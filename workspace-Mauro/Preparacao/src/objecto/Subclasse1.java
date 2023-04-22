package objecto;

public class Subclasse1 extends Objecto{
private int numero;

public Subclasse1(String nome,int numero) {
	super(nome);
	this.numero=numero;
	}
public String saida() {
	return "SUBCLASSE 2";
}
public String saida(String g) {
	// TODO Auto-generated method stub
	return g;
}
}
