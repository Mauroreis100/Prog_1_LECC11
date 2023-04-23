package main;
import objectoImovelMovel.*;
public class MainImovek {
public static void main(String[] args) {
	//public Velho(String endereco, double preco, double desconto) {
	Velho velho=new Velho("LIberdade",2000,5);

	System.out.println(velho.toString());
	Novo novo=new Novo("Matola",500,10);

	System.out.println(novo.toString());
}
}
