package main;

/*import objectos.Animal;
import objectos.Vaca;
import objectos.Elefante;
*/
import finalmente.Animal;
import finalmente.Vaca;
public class MainAnimal {
public static void main(String[] args) {
	Vaca v=new Vaca();
	System.out.println(v.comer("Vaca comendo comida apropriada"));
	/*Imprime a mensagem quando retiro o modificador final e coloco
	 * e coloque no método comer(), agora tente sobreescrever o 
	 * método comer() na classe Vaca.java
	*/
	/*Animal a=new Animal();
	System.out.println(a.comer());
	
	Vaca v=new Vaca();
	System.out.println(v.comer());
	
	Animal av=new Vaca();
	System.out.println(av.comer());*/
	
	/*Quando tento herdasr a partir da classe Vaca com o modificador final
	 *  no animal
	 *  Copia a classe Animal.java, e Vaca.java abaixo para um outro pacote, declare a 
	 *  classe Animal como Final, agora tente herdar a partir da classe Vaca.
	 *  
	 */
	//The type Vaca cannot subclass the final class Animal na classe Vaca erro
	//Type mismatch: cannot convert from Vaca to Animal
	
	/*Ele nao permite ter um*/

	
}
}
