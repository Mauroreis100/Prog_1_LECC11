package cliente;

import java.util.Vector;

public class OperecoesCliente {

public boolean adicionarCliente(Vector lista, Cliente cl) {
	return lista.add(cl);
}

public void compra(int id,Cliente cl,Vector lista,Vector compra) {
	int index=lista.indexOf(cl);
	((Cliente)lista.get(index)).setCompras(compra);
}
	//TENHO DE APLICAR IVA AQUI
}
