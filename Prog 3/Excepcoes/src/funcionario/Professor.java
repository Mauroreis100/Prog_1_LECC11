package funcionario;

public class Professor extends Funcionario {
	int salario;

	public void setSalario(int salario) {
		if (salario > 0) {
			this.salario = salario;
		} else {
			throw new ValorSalarioNegativoException("O VALOR DO SALÁRIO DEVE SER"
					+ "MAIOR QUE 0\n " + salario+ " INVALIDO");
		}

	}
}
