package arranca;

import base.Conta;
import logica.Cliente;

public class Executa {

	public static void main(String[] args) {
		//Cliente desonesto
		Cliente desonesto=new Cliente();
		desonesto.setId(1);
		desonesto.setNome("João");
		desonesto.setSexo("M");
		
		//Cliente honesto
		Cliente honesto=new Cliente();
		honesto.setId(2);
		honesto.setNome("Maria");
		honesto.setSexo("F");
		
		//Cliente Conta1
		Conta conta1=new Conta();
		conta1.setId(123);
		conta1.setNome("CC");
		conta1.setSaldo(100);
		conta1.setCl(desonesto);
		conta1.imprimeSaldo(); //Impressão 1
		//
		//Cliente Conta2
		Conta conta2=new Conta();
		conta2.setId(1234);
		conta2.setNome("CC");
		conta2.setSaldo(2000);
		conta2.setCl(honesto);
		conta2.imprimeSaldo();//Impressão 2
		System.out.println();
		
		conta1.setId(1234);//Troca de IDs
		conta2.setId(123);//Troca de IDs
		conta1.imprimeSaldo(); //Impressão 1
		conta2.imprimeSaldo();//Impressão 2
		
		
		
		

	}

}
