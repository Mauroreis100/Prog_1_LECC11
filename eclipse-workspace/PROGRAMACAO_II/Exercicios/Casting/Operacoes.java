package Casting;

import java.util.*;

public interface Operacoes {
	public void inserirVeiculo(Veiculos v);
	public void listarVeiculo(Veiculos V);
	public Veiculo procurarMatricula(Veiculos V,String matricula);
	public void listarmarca(Veiculos V,String marca);
	public void listarMais24(Veiculos V,Date hora);
		
}
