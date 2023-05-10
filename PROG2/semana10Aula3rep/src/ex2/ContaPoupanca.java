package ex2;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}


	@Override
	void depositar(double valor) {
		// TODO Auto-generated method stub
		super.setSaldo(super.getSaldo()+valor);
	}

	@Override
	void sacar(double valor) {
		// TODO Auto-generated method stub
		super.setSaldo(super.getSaldo()-valor);
	}

}
