import java.util.Scanner;
public class Ex16{
	public static void main(String[] args) {  
    Scanner in = new Scanner (System.in);
    System.out.println("programa para mostrar vetor");
	int soma=0;
	double media=0;

    int[] numeros = new int[10];//objecto que irá armazenar os nrs digitados
	System.out.print("Digite os numero: ");
    for(int i = 0; i < 10; i++){
         
         numeros[i] = in.nextInt();
	 
    }

    System.out.println("\n----------------Informando números digitados---------------------\n");        

		for(int n : numeros) {
          System.out.println(" " + n);
		  soma+=n;
		  media+=n/10;
	
		}
		System.out.println("A soma ="+soma+" e a media"+media);
	}
}