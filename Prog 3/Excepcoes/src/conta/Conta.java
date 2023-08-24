package conta;

public class Conta {
	private double dinheiro = 5000;
	private double limite = 1000;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void saca(double dinheiro) {
			verificacao(dinheiro);
			setDinheiro(getDinheiro() - dinheiro);
			System.out.println(toString());
	}

	public void verificacao(double dinheiro) {
		if ((getDinheiro() - dinheiro) < 0 || dinheiro < 0 || dinheiro > getLimite()) {
			throw new ContaExcecao("VALOR INDISPONÍVEL");
		}
	}
	public void deposita(double dinheiro) {
		setDinheiro(dinheiro+getDinheiro());
		System.out.println(toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A SUA CONTA TEM "+dinheiro+"MT";
	}
}
