package object;

public class Pessoa {
private String nome;
private char sexo;
private float idade;

public Pessoa(String nome, char sexo, float idade) {
	this.nome = nome;
	this.sexo = sexo;
	this.idade = idade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public float getIdade() {
	return idade;
}
public void setIdade(float idade) {
	this.idade = idade;
}
@Override
public String toString() {
	return "A Pessoa de nome " + nome + "\nsexo:" + sexo + "\ncom Idade=" + idade;
}

}
