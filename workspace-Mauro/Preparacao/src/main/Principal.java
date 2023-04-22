package main;
import objecto.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nome, int numero, float id
		Subclasse3 sub3=new Subclasse3("Nome",21,3);
		System.out.println(sub3.saida("MENSAGEM"));
		System.out.println(sub3.saida());
	}

}
