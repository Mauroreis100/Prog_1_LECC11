package main;

public class Simulacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Erro:Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "nulo[1]" is null

		String nulo[] = { "Olá ", null };
		System.out.println((nulo[1].toUpperCase()));//Runtime Exception É PREVISTO

//Exception in thread "main" java.lang.StackOverflowError
		System.out.println(soma());
	}

	public static double soma() {//ESTE TAMBÉM É PREVISTO
		return soma();
	}
}
//ver online em que catetgoria se encaixa.


