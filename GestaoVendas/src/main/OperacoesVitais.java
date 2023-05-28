package main;

import java.util.Vector;

import produto.Produto;

public class OperacoesVitais {

	public int procurarCodigo(Vector lista,int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if( ((Produto)lista.get(i)).getId() ==codigo) {
				return i;
			}
		}
		return -1;
	}
}
