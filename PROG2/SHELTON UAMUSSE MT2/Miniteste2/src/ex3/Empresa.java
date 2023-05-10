package ex3;

import java.util.Arrays;

public class Empresa {
	private Funcionario [] funcionarios;
	private int c;
	
	
	
	public Empresa(int c) {
		
		funcionarios = new Funcionario[c];
		c = 0;
	}



	public void adicionarFunc (Funcionario funcionario) {
		
		if(c < funcionarios.length) {
			funcionarios[c] = funcionario;
            c++;
		}
	}
	
	
	public double calcularSalarioTotal() {
		
        double salarioTotal = 0.0;

        for (int i = 0; i < c; i++) {
            salarioTotal += funcionarios[i].calcularSalarioB();
        }

        return salarioTotal;
    }



	@Override
	public String toString() {
		return "Empresa com os funcionarios=" + Arrays.toString(funcionarios) + " \n Tem salarioTotal ="+calcularSalarioTotal();
	}
	
	

	
	
}
