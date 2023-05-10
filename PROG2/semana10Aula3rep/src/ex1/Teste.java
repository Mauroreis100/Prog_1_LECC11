package ex1;
import java.util.Scanner;
public class Teste {
	
	public static void main(String[] args) {
		
		
		
		Veiculo carro = new Carro();
		Veiculo moto = new Moto();
		carro.acelerar();
		carro.acelerar();
		System.out.println(carro.toString());
		
		
		
		
		
		
		
		
		//Veiculo moto = new Moto();
		/*
		if(carro.getVelocidade() < 0) {
			System.out.println("Carro está stopado");
			vel = carro.getVelocidade()+carro.acelerar();
		} else {
			vel = carro.getVelocidade()+carro.frear();
		}
		
		
		if(moto.getVelocidade() < 0) {
			System.out.println("Moto está stopado");
		} else {
			vel2 = moto.getVelocidade()+moto.acelerar();
			vel = carro.getVelocidade()+moto.frear();
		}
		
		System.out.println("A velocidade do carro é "+vel);
		System.out.println("A velocidade da moto "+vel2);
		*/
		
	}
}
