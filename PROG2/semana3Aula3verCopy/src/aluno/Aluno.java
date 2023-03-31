package aluno;

public class Aluno {
	
	//atributos
		private String nome, matricula;
		private short idade;
		private double [] nota = new double[3];
		
	//getters and setters
		
	public short getIdade() {
			return idade;
		}

	public void setIdade(short idade) {
		this.idade = idade;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(int pos, double nota) {
		this.nota[pos] = nota;
	}

	
	
	//metodo para calcular media
	
	public double calcularMedia() {
		double soma = 0, media = 0;
		int i=0;
		
		while(i<nota.length) {
			soma += nota[i];
			i++;
		}
		
		
		return media=soma/3;
	}

}
