package contaloja;

public abstract class Conta {
protected String titular;
protected double saldo;

public Conta(String titular, double saldo) {
	this.titular = titular;
	this.saldo = 0;
}
public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
abstract boolean depositar(double valor);
abstract boolean sacar(double valor);
abstract String saldo();
}
