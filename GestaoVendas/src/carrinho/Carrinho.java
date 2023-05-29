package carrinho;
import java.util.Vector;

import produto.Produto;
public class Carrinho {
private String nome;//Nome do Shopping;Location
private double iva;
private double total;
private Vector produtos;
public Carrinho(String nome, Vector produtos) {
	this.nome = nome;
	this.iva = 16/100;
	this.produtos=produtos;
}
public Carrinho(Vector produtos) {
	this.produtos=produtos;
}

public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Carrinho() {}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getIva() {
	return iva;
}
public void setIva(double iva) {
	this.iva = iva;
}
public Vector getProdutos() {
	return produtos;
}
public void setProdutos(Vector produtos) {
	this.produtos = produtos;
}
@Override
public String toString() {
	return "Carrinho [nome=" + nome + ", iva=" + iva + ", produtos=" + produtos + "]";
}


}
