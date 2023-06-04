package objecto;

public class Vendedor extends Funcionario{
private double comissao;
private double vendas;

public Vendedor(String nome, int numeroBi, double salario,double comissao, double vendas) {
	super(nome,numeroBi,salario);
	this.comissao = comissao;
	this.vendas = vendas;
}
public double getComissao() {
	return comissao;
}
public void setComissao(double comissao) {
	this.comissao = comissao;
}
public double getVendas() {
	return vendas;
}
public void setVendas(double vendas) {
	this.vendas = vendas;
}
public double bonus() {
	return getSalario()*0.15;
}
}
