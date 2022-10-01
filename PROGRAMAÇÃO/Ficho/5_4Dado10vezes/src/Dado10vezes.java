/*Crie uma classe que simule a jogada de um dado (de seis lados) 
 * dez vezes e mostre o resultado na tela.
 */
import java.util.Random;
public class Dado10vezes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio=new Random();
		for (int i=1;i<=10;i++) {
			
			int dado=aleatorio.nextInt(7);	
			if(dado!=0) {
				System.out.println(i+"º lançamento:"+dado);
			}else {
				i--;
			}
			
		}
		
	}

}
