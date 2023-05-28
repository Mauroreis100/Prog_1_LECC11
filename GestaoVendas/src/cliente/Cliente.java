package cliente;

import java.util.Vector;

public class Cliente {

	private int id;
	private String nome, bi;
	private Vector compras;

	/*
	 * O cliente tem um vector de todas as compras já feitas Caso tenha de recuperar
	 * ou iniicializar pela primeira vez, este construtor leva o vector, vazio ou
	 * não
	 */
	public Cliente(int id, String bi, String nome, Vector compras) {
		this.id = id;
		this.bi = bi;
		this.nome = nome;
		this.compras = compras;
	}

	public String getBi() {
		return bi;
	}

	public void setBi(String bi) {
		this.bi = bi;
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
