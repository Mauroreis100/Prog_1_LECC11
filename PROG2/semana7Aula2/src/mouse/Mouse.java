package mouse;
import produto.Produto;
//import livro.Livro;

public class Mouse extends Produto {
	private String tipo;

	
	public Mouse(String nomeLoja, double preco, String tipo) {
		super(nomeLoja, preco);
		this.tipo = tipo;
	}
	
	

	public String getTipo() {
		return "optico";
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String getDescricao() {
		return  tipo;
	}
	
	
}
