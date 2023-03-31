package exHerancaSubClasseTrab;
import exHeranca.Pessoa;

public class Trabalhador extends Pessoa {
	private String categoria;
	private String funcao;
	
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	void trabalhar() {}
	
	
}
