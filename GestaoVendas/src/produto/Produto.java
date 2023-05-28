package produto;

public class Produto {
private int id;
private String nome;
private int qtd;

public Produto(int id, String nome) {
	this.id=id;
	this.nome=nome;
}
public Produto(int qtd) {
	this.qtd=qtd;
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
public int getQtd() {
	return qtd;
}
public void setQtd(int qtd) {
	this.qtd = qtd;
}
public Produto(int id, String nome, int qtd) {
	this.id = id;
	this.nome = nome;
	this.qtd = qtd;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Produto [id=");
	builder.append(id);
	builder.append(", nome=");
	builder.append(nome);
	builder.append(", qtd=");
	builder.append(qtd);
	builder.append("]");
	return builder.toString();
}

}
