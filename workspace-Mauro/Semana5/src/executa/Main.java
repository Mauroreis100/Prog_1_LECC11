package executa;

import object.Funcionario2;
import object.Vendedor;

public class Main {
	public static void main(String[] args) {
		// Funcionario2 f=new Funcionario2("Milton Timana","Passaporte",1213321,20000);
//Vendedor v = new Vendedor("Nome", "Tipo de Documento", Nr de Documento, Salario, Comissao de 5%);
		Vendedor v = new Vendedor("Milton Timana", "Passaporte", 1213321, 10000, 4000);
		Vendedor a = new Vendedor("Milton Timana", "Passaporte", 1213321, 10000, 2);
		//System.out.println(v);
		//v.imprimir();
		//v.imprimir("Mauro");
		System.out.println(v.toString());
		System.out.println(a.toString());
	}
}
