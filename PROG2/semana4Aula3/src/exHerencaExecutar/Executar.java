package exHerencaExecutar;

import java.util.Scanner;

import exHerancaSubClasseTrab.Trabalhador;

import exHerancaSubClasseEst.Estudante;

public class Executar {
	
	public static Scanner ler = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Estudante est = new Estudante ();
		Trabalhador trab = new Trabalhador ();
		
		System.out.println("Inserção dos dados do estudante");
		
		
		System.out.println("Insira o nome do estudante: ");
		est.setNome(ler.next());
		
		System.out.println("Insia o endereco do estudante"+est.getNome());
		est.setEndereco(ler.next());
		
		System.out.println("Insira o ano escolar do estudante "+est.getNome());
		est.setAnoEscolar(ler.nextShort());
		
		System.out.println("");
	}
}
