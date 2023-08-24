package funcionario;
/*
 * Exercício 3: Tratamento de Exceções
Crie uma classe Funcionário que tem 2 subclasses AlunoTrabalhador e Professor. O professor tem um salario fixo positivo, enquanto o alunoTrabalhador recebe pelas horas que ele trabalha, o aluno trabalhador nunca poderá trabalhar horas negativas e também não poderá exceder 160horas.

Exercício 4: Exceções Próprias
Refaça o exercício anterior mais não usando as exceções disponíveis na biblioteca do JAVA, crie suas propiás exceções que tem mensagens mais claras. Exemplo: HorasInvalidasException
*/
public class Main {

	public static void main(String[] args) {
		AlunoTrabalhor at=new AlunoTrabalhor();
		at.setHoras(-2);
		
		Professor prof=new Professor();
		prof.setSalario(0);

	}

}
