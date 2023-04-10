package main;

import java.util.Scanner;

import objecto.Administrador;
import objecto.Funcionario;
import objecto.Vendedor;
import objecto.ControlaBonus;
public class MainFuncionario {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		Vendedor v=new Vendedor("Nome",12331213,100,12,13);
		Vendedor v1=new Vendedor("Nome",12331213,100,12,13);
		Administrador a1=new Administrador("Nome",12331213,200,13);
		/*Polimorfismo, sabe que V é um vendedor apesar de estar a 
		 * ser representado como Funcionario	
		*/
		Funcionario f=v;
		ControlaBonus cb=new ControlaBonus();
		System.out.println(cb.calculaBonus(v));
		System.out.println(cb.calculaBonus(v1));
		System.out.println(cb.calculaBonus(a1));
		System.out.println(cb.calculaBonus(v));
		//System.out.println(cb);
		//CB devia pedar the highest thing on the top
	
	}
	}
