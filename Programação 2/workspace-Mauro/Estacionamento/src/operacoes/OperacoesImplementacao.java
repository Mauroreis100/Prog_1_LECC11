package operacoes;

import java.util.Vector;

import estacionamento.Veiculo;

public class OperacoesImplementacao implements Operacoes {

	@Override
	public void inserir(Veiculo veiculo, Vector estacionamento) {
		estacionamento.add(veiculo);
	}

	@Override
	public void listar(Vector estacionamento) {
		for (int i = 0; i < estacionamento.size(); i++) {
			System.out.println((Veiculo) estacionamento.get(i));
		}
	}

	@Override
	public Veiculo procurar(Vector estacionamento, String matricula) {

		for (int i = 0; i < estacionamento.size(); i++) {
			if ((((Veiculo) estacionamento.get(i)).getMatricula()).equals(matricula)) {
				return (Veiculo)estacionamento.get(i);
			} else {
				System.out.print("TESTE");
				
			}
		}
		return null;
	}

	@Override
	public void procuraMarca(Vector estacionamento,String marca) {
		for (int i = 0; i < estacionamento.size(); i++) {
			if ((((Veiculo) estacionamento.get(i)).getMarca()).equals(marca)) {
				System.out.println((Veiculo)estacionamento.get(i));
			} else {
				System.out.println();
				
			}
		}

	}

	@Override
	public void acimaDaHora() {

	}

}
