package cliente;

import java.util.Vector;

public class Cliente {

private int id;
private String nome;
private Vector compras;
public Cliente(int id, String nome, Vector compras) {
	this.id = id;
	this.nome = nome;
	this.compras = compras;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Vector getCompras() {
	return compras;
}
public void setCompras(Vector compras) {
	this.compras = compras;
}

@Override
public String toString() {
	return "Cliente [id=" + id + ", nome=" + nome + ", compras=" + compras + "]";
}

}
