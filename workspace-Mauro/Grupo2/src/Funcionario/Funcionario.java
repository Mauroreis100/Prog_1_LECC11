package Funcionario;

import Pagamento.Pagamento;

public abstract class Funcionario implements Pagamento {
    protected String nome;
    protected double salario;
    protected double bonus;
    protected double desconto;

    public Funcionario(String nome, double salario, double bonus, double desconto) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public abstract double calcularPagamento( double salario);


	public String toString() {
		return "o nome e " + nome + ",o salario e" + salario + ",o bonus e" + bonus + ",o desconto e" + desconto;
	}
}

