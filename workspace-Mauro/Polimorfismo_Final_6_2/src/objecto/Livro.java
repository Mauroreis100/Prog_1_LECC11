package objecto;

public class Livro extends Produto{
	private String autor;

	public Livro(String nomeLoja, double preco, String autor) {
		super(nomeLoja, preco);
		this.autor=autor;
		// TODO Auto-generated constructor stub
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return super.toString()+super.getDescricao()+"- livro digital"+autor+"]\n";
	}
}
