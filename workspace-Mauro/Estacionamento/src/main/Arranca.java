package main;
import operacoes.OperacoesImplementacao;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import veiculos.Carro;

public class Arranca {

	public static void main(String[] args) {
Scanner ler=new Scanner(System.in);
Date data = null;//é calendar

Carro c=new Carro("Carlos","TOYOTA","COROLLA","JFK-32-MC","Cinzento",data,3);
Vector v=new Vector();
OperacoesImplementacao op=new OperacoesImplementacao();
//INTERESSANTE
op.inserir(c, v);
op.inserir(c, v);
op.listar(v);
System.out.println(op.procurar(v, "JFK-32-MC").getMatricula());
	}

}
