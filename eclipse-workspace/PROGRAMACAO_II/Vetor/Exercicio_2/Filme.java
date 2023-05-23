package Exercicio_2;

import java.util.*;

public class Filme{
	
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
	
	@Override
	public String toString() {
		return  "O numero do filme"+numeroFilme+"\n Nome do filme:"+nomeFilme+"\n G. do filme: "+genero+"\n "
				+ "A. de Lançamento: "+anoLancamento;
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