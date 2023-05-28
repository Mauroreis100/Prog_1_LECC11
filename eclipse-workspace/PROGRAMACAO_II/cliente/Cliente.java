package cliente;

import java.util.*;

public class Cliente {

	private String nomeCliente;
	private int codigoIdentificacao;
	private double contaCorrente;
	private int telefone;
	private Calendar data_criacao= Calendar.getInstance();
	private Vector compras;
	private Vector carrinho;

	//Construtor
	public Cliente(String nomeCliente,int codigoIdentificacao,double contaCorrente,int telefone) {
		this.nomeCliente=nomeCliente;
		this.codigoIdentificacao=codigoIdentificacao;
		this.contaCorrente=0;
		this.telefone=telefone;
		this.data_criacao=null;
	}

	//Ver as dados do cliente - Read
	public String toString(){
		return "Nome do cliente: "+nomeCliente+"\nCódigo de Identificação: "+codigoIdentificacao+
				"\nConta Corrente: "+contaCorrente+"\nNúmero de telefone: "+telefone+"\nData de criação: "+data_criacao;
	}
	//Getters e Setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(int codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	public double getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(double contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Calendar getData_criacao() {
		return data_criacao;
	}
	
	public void setData_criacao(Calendar data_criacao) {
		this.data_criacao = data_criacao;
	}
	public Vector getCompras() {
		return compras;
	}
	public void setCompras(Vector compras) {
		this.compras = compras;
	}
	
	public Vector getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Vector carrinho) {
		this.carrinho = carrinho;
	}
}