package src;

import java.util.Random;

public class Conta {
	private int num_conta;
	private String nome;
	private double valorInicial;

	Conta(){}
	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}


	public Conta(String nome, double valorInicial) {
		this.nome = nome;
		this.valorInicial = valorInicial;
	}



	@Override
	public String toString() {
		return "Conta [num_conta=" + num_conta + ", nome=" + nome + ", valorInicial=" + valorInicial + "]";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

}
