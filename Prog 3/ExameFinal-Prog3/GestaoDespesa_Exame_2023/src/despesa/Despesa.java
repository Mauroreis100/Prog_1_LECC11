package despesa;

import java.util.Date;
import java.util.Vector;

public class Despesa {
private String descrição,categoria;
private double valor;
private String data;
public String getDescrição() {
	return descrição;
}
public void setDescrição(String descrição) {
	this.descrição = descrição;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}

@Override
public String toString() {
	return "Despesa [descrição=" + descrição + ", categoria=" + categoria + ", valor=" + valor + ", data=" + data + "]";
}
public String getCategoria() {
	return categoria;
}


}
