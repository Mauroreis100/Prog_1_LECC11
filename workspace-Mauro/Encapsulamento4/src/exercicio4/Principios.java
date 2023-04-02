package exercicio4;

public class Principios {
private float idade, altura;
private String nome;

//Encapsular = getters e setters
public float getIdade() {
	return idade;
}
public void setIdade(float idade) {
	this.idade = idade;
}
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
@Override
public String toString() {
	return "Principios [idade=" + idade + ", altura=" + altura + ", nome=" + nome + "]";
}

}
