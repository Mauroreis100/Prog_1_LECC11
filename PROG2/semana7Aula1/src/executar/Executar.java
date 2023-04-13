package executar;
import animal.Animal;
import vaca.Vaca;
import elefante.Elefante;

public class Executar {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.toString());
		
		Vaca v = new Vaca();
		System.out.println(v.comer());
		//v.comer();
		
		Animal av = new Vaca();
		System.out.println(av.comer());
		//av.comer();
		
		Animal af = new Elefante();
		System.out.println(af.toString());
		//af.comer();
	}
}
