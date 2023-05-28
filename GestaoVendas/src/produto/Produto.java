package produto;

public class Produto {
private int id;
private String nome,tipo;
private int qtd;//qtd
private int vendas;//Quantas vezes este produto foi vendido?

/*No momento que lês para inserir um produto no vector
Decidi não lidar com a quantidade,
Para colocar no carrinho, a quantidade muda "Virtualmente"
Ou seja não fez a mudança necessariamente porque pode remover do carrinho
que seria devolver o produto a prateleira
*/ 
public Produto(int id,String nome) {
	this.id=id;
	//this.tipo=tipo;
	this.nome=nome;
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

//TENHO CONSTRUTOR DE quantidade que será usado para recuperar (eu acho)
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
