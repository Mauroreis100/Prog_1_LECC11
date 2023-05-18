package operacoes;

import java.util.Vector;

import estacionamento.Veiculo;

public interface Operacoes {
public void inserir(Veiculo veiculo, Vector estacionamento);
public void listar(Vector estacionamento);
public Veiculo procurar(Vector estacionamento,long matricula);
public void procuraMarca(Vector estacionamento,String marca);
public void acimaDaHora();
}
