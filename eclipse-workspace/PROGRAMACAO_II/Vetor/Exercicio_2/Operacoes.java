package Exercicio_2;

import java.util.Vector;

public interface Operacoes {

	public boolean adicionarFilme(Filme film,Vector filmes);
	public boolean verificarExistencia(String filme,Vector filmes);
	public void atualizarGenero(String filme,String genero,Vector filmes);
	public void listarFilmes(Vector filmes);
	public void filmeAnoLancamento(int anoLancamento,Vector filmes);
	public void nomeAtravesIndice(int indice,Vector filmes);
	public boolean removerFilme(String nomeFilme,Vector filmes);
	public void inserirFilme(Vector filmes,Filme film,int posicao);
}