package Exercicio_2;

import java.util.*;

public class Executa {

	public static void main(String[] args) {
		
		Vector filmes = new Vector();
		
		OperacoesFilme op = new OperacoesFilme();
		
		//Criação dos filmes
		Filme filme1 = new Filme(12345,"Avatar: O Caminho da Água","Acção",2022);
		/*Filme filme2 = new Filme(21345,"Top Gun: Maverick","Acção",2022);
		Filme filme3 = new Filme(31245,"Tenet","Acção",2020);
		Filme filme4 = new Filme(23422,"O Telefone Preto","Terror",2022);
		Filme filme5 = new Filme(24245,"Os Inocentes","Terror",2021);*/
			
		filmes.add(filme1);
		/*filmes.add(filme2);
		filmes.add(filme3);
		filmes.add(filme4);
		filmes.add(filme5);*/
		
		op.listarFilmes(filmes);
	}
}
