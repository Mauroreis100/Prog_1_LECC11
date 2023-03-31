package vip;

import bilhete.Bilhete;

public class VIP extends Bilhete {
	private double valorAdicional;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double adicionarValor() {
		return (valorAdicional+getValor());
	}
}
