package numero4;

import java.util.Random;
import java.util.Vector;

public class Preenche {

	public static Vector Preenchido() {
		Random aleatorio;
		Vector numeros = new Vector();
		
		while (numeros.size() != 10) {
			aleatorio = new Random();
			numeros.add(aleatorio.nextInt(2));
		}
		return numeros;
	}
	public static Vector Removido(Vector lista) {
		System.out.println("Antes+\n"+lista.toString());
		for (int i = 0; i < lista.size(); i++) {
			if((int)lista.get(i)==0) {
				lista.remove(i);
			}
		}
		return lista;
	}
	public static void main(String[] args) {
		Vector lista=Preenchido();
		System.out.println(lista.toString());
		System.out.println(Removido(lista)+"<<<<----DEPOIS");
		
	}

}
