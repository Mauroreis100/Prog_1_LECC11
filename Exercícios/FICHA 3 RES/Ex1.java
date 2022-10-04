import java.util.Scanner; //visto que é necessário a entrada de dados, devemos importar esta biblioteca
// import... permite-nos introduzir dados atraves d classe scanner (nome da variavel) = new Scanner (System.in)
// implementa métodos para a entrada de dados
public class Ex1 {
	public static void main (String[] args) {
	
	
		int num;
		Scanner input = new Scanner (System.in);
		System.out.print ("Insira um número: ");
		
		num = input.nextInt ();
		
		if (num > 0 && num % 2 == 0 ) {
			System.out.println ("O número é par e positivo");
				
		} 
		else if (num > 0) {
				System.out.println ("O número é positivo");
				
				
		}	

		
		else {
			
			System.out.println ("O número nao é par, nao é positivo");	
        }
	}
}