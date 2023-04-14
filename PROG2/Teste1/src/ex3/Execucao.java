package ex3;

public class Execucao {
	public static void main(String[] args) {
		
		Locadora c1 = new Locadora("BMW","X1",2010,1500,(short)2);
		Veiculo c2 = new Veiculo("Toyota", "Sprinter", 2008, 100);
		Carro c3 = new Carro("Toyota", "Ractis",2015, 1300, (short)4);
		
		
		System.out.println(c1.toString()+" "+c1.alugar(c3, 100, 7));
		
		
		System.out.println(c2.toString());
	}
	
	
}
