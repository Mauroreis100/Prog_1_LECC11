package numero5;

import java.util.Vector;
import java.util.Vector;
public class ComportamentosPessoa extends Pessoa implements Comportamento{
	public Vector v=new Vector();
public ComportamentosPessoa(int id, String nome, int idade, float altura) {
	super(id,nome,idade,altura);
}
public void adicionaPessoa(int id, String nome, int idade, float atura) {
	ComportamentosPessoa p=new ComportamentosPessoa(id,nome,idade,altura);
	v.add(p);
}
public void removePessoa(int id) {
	for (int i = 0; i < v.size(); i++) {
		if(((ComportamentosPessoa)v.get(i)).getId()==id) {
			v.removeElementAt(i);
		}
	}
}
public Pessoa buscaPessao(int idade){
	for (int i = 0; i < v.size(); i++) {
		if(((ComportamentosPessoa)v.get(i)).getIdade()==idade) {
			return (ComportamentosPessoa)v.get(i);
		}
	}
	return null;
}
public Pessoa buscaNome(String nome) {
	for (int i = 0; i < v.size(); i++) {
		if(((ComportamentosPessoa)v.get(i)).getNome().toLowerCase()==nome.toLowerCase()) {
			return (ComportamentosPessoa)v.get(i);
		}
	}
	return null;
}
public Vector relatorio() {
	Vector devolve=new Vector();
	for (int i = 0; i < v.size(); i++) {
			devolve.add(((ComportamentosPessoa)v.get(i)).toString());
	}
	return devolve;
}

}
