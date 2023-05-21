package ex1;
import java.util.*;
public interface Operacoes {
	
	boolean inserirVeiculo(Vector lista, Veiculo veiculo);
	
	void listar(Vector lista);
	
	Veiculo  procurarMatricula(Vector lista, String matricula);
	
	void listarPorMarca(Vector lista, String marca);
	
	void listarMais(Vector lista);
;	
}
