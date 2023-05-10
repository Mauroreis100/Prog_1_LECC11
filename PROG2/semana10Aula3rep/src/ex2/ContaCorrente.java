package ex2;

public class ContaCorrente extends Conta {

	public ContaCorrente(String titular, double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sacar(double valor) {
		super.setSaldo(super.getSaldo()-valor*0.05-valor);
		
	}





}
