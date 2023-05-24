package interfaces;
import java.util.Vector;

import objectos.Produto;
public interface Operacoes {
	public boolean registrarProd(Vector estoque, Produto prod);
	public String QtdDisponivel(Vector estoque,int cod);
	public boolean removerProduto(Vector estoque,int cod);
	public String actualizarPreco(Vector estoque,int cod, double precoNovo);
}
