package relatorio;

import implementar.Salario;
import funcionario.Funcionario;
import funcionarios.*;
import java.util.*;

public class Empresa {
	private int tamanho;
	private int indice = 0;
	private Funcionario f[] = new Funcionario[5];
	//!!1Problema - O tamanho não está a ser definido por pedido

	public Funcionario[] getF() {
		return f;
	}

	public int getTamanho() {

		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = 5;//DINAMICO
	}

	public boolean add(Funcionario fun) {
		if (indice < getTamanho()) {
			f[indice] = fun;
			indice++;
			return true;
		} else {
			System.out.println("LISTA PREENCHIDA! IMPRIME");
			return false;
		}
	}

	public double calculo() {
		double total = 0;
		for (int i = 0; i < getF().length; i++) {
			total += getF()[i].salario();
			// System.out.println(total);
		}
		return total;
	}

	public void impressaoTotal() {
		System.out.println("O salário total de todos so funcionários da empresa é " + calculo());
	}

}
