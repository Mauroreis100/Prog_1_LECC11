package exercicio2;

public class Pessoa {
	public String nome;
	public int id;
	public int idade;
	public int qtdidade=0;
	
	public int CompletarAnos() {
		return qtdidade++;
		
		
	}

	public String imprimir() {
		return "pessoa [nome=" + nome + ", id=" + id + ", idade=" + idade + ", qtdidade=" + qtdidade + "a idade actual é"+(CompletarAnos()+idade)+"]";
	}
		
}
