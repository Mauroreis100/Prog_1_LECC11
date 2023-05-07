package contaloja;

public final class ContaPoupanca extends Conta{

	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
		
	}

	@Override
	boolean depositar(double valor) {
		if(valor>0) {
		super.setSaldo(getSaldo() + valor);
		System.out.println("DEPOSITOU COM SUCESSO!");
		return true;
		}else {
		return false;}
	}

	@Override
	boolean sacar(double valor) {
		if(valor>super.getSaldo()) {
			System.out.println("ERROR 302! SALDO INSUFICIENTE");
			return false;
		}else {
			super.setSaldo(getSaldo() - valor-(valor*0.05));
			System.out.println("SUCESSO!");
			return true;
			
		}
	}
	String saldo() {
		return super.saldo+"MT";
	}

}
