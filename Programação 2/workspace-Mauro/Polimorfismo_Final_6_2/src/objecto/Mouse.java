package objecto;

public class Mouse extends Produto{
private String tipo;

public Mouse(String nomeLoja, double preco, String tipo) {
	super(nomeLoja, preco);
	this.tipo=tipo;
	// TODO Auto-generated constructor stub
}
public String getDescricao() {
	return super.toString()+super.getDescricao()+" "+tipo+" ]\n";
}


}
