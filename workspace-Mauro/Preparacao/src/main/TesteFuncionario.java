package main;
import objecto.*;
public class TesteFuncionario {
public static void main(String[] args) {
	Funcionarios f=new Funcionarios("Antorio",10,4500.4);
	//Teste da classe Funcionario
	System.out.println(f.toString()+"]");
	
	
	Efetivo e=new Efetivo("Joao",1002,1000.7,200.2);
	//Teste da classe Efetivo
		System.out.println(e.toString()+"]");
		
		
		Terceirizado t=new Terceirizado("Bruno",001001,70000.1,400.3);
		//Teste da classe Terceirizado
		System.out.println(t.toString()+"]");
}
}
