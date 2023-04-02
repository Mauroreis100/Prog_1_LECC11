package aluno;

public class Aluno {
	private String nome;
	private int matricula;
	private short idade;
	private double nota1, nota2, nota3;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setIdade(short idade) {
		this.idade = idade;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public String situacao() {
		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7) {
			return "Aprovado com " + media;
		} else {
			return "Reprovado com " + media;
		}
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", nota3=" + nota3 + ", Situacao: "+ situacao();
	}

}
