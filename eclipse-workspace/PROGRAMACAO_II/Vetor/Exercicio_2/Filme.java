package Exercicio_2;

import java.util.*;

public class Filme {
	
	private int numeroFilme;
	private String nomeFilme;
	private String genero;
	private int anoLancamento;
	
	//Construtor
	public Filme(int numeroFilme,String nomeFilme,String genero,int anoLancamento) {
		this.numeroFilme=numeroFilme;
		this.nomeFilme=nomeFilme;
		this.genero=genero;
		this.anoLancamento=anoLancamento;
	}
	
	//Verificar se um filme existe
	public boolean verificarExistencia(String filme,Vector filmes) {
		for(int i=0;i<filmes.size();i++) {
			if(filmes.get(i)==filme) {
				return true;
			}
		}
		return false;
	}
	
	//Metodo para atualizar o genero
	public void atualizarGenero(String filme,String genero,Vector filmes) {
		if(verificarExistencia(filme, filmes)==true) {
			for(int i=0;i<filmes.size();i++) {
				if(((Filme)filmes.get(i)).getNomeFilme()==filme) {
					
				}
			}
		}
	}
	
	//Listar filmes atraves do ano de lancamento
	public void filmeAnoLancamento(int anoLancamento,Vector filmes) {
		for(int i=0;i<filmes.size();i++) {
			if((((Filme) filmes.get(i)).getAnoLancamento())==anoLancamento) {
				System.out.println(((Filme) filmes.get(i)).getNomeFilme());
			}
		}
	}
	
	//Devolver o nome atraves do indice fornecido
	public void nomeAtravesIndice(int indice,Vector filmes) {
		System.out.println(((Filme) filmes.get(indice)).getNomeFilme());
	}
	
	
	//Remover um filmes
	public boolean removerFilme(String nomeFilme,Vector filmes) {
		for(int i=0;i<filmes.size();i++) {
			if((((Filme) filmes.get(i)).getNomeFilme()).equalsIgnoreCase(nomeFilme)) {
				filmes.removeElement(filmes.get(i));
				return true;
			}
		}
		return false;
	}
	
	//Inserir um filme
	public void inserirFilme(String nomeFilme,Vector filmes) {
		
	}
	
	
	//Getters e Setters
	public int getNumeroFilme() {
		return numeroFilme;
	}

	public void setNumeroFilme(int numeroFilme) {
		this.numeroFilme = numeroFilme;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNome(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
		
	}
}