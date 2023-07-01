package numero5;

public abstract class Pessoa {
private int id,idade;
private String nome;
protected float altura;

public Pessoa(int id, String nome, int idade, float altura) {
	this.id=id;
	this.nome=nome;
	this.idade=idade;
	this.altura=altura;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome=nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade=idade;
}
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura=altura;
}
public String toString() {
	return id+" - "+nome+"\nIdade::"+idade+"\nAltura: "+altura;
}
}
