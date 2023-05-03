package exercicio4;

public class Executar {
	public static void main(String[] args) {
		Animal r = new Mamifero("Cao");
		Animal c = new Reptil("Cobra");
		
		//r.emitirSom();
		//c.emitirSom();
		Animal jaula[] = new Animal[2];
		
		jaula[0] = r;
		jaula[1] = c;
		
		for(int i = 0; i < jaula.length; i++) {
			
			System.out.print(jaula[i].getNome()+" ");
			jaula[i].emitirSom();
			System.out.println();
		}
		
		
	}
}
