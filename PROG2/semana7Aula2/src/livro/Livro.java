package livro;
import produto.Produto;

public class Livro extends Produto {
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	
	public Livro(String nomeLoja, double preco, String autor) {
		super(nomeLoja,preco);
		this.autor = autor;
	}
	
	@Override
	public String getDescricao() {
		return  autor;
	}

	@Override
	public String toString() {
		return super.toString()+"Livro [autor=" + autor + "]"+getDescricao();
	}

	//public Livro() {}
	
	
}
