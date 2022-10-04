import java.util.Scanner;
public class Ex23{
public static void main(String args[]){
Scanner ler=new Scanner(System.in);

String nome,r;

System.out.println("Insira seu nome completo: ");
nome=ler.nextLine();

r=nome.toUpperCase();

System.out.print(r.charAt(0));

	for(int i=0;i<nome.length();i++){
		if(r.charAt(i)==' '){
			System.out.print(r.charAt(i+1));			
			
		}
		
	}

}
}	