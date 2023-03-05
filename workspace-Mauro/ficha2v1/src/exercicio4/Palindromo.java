package exercicio4;
import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str = sc.nextLine();
        if (palindromo(str)) {
            System.out.println("A string '"+str+"' é um palíndromo.");
        } else {
            System.out.println("A string '"+str+"' não é um palíndromo.");
            //'\"+str+\"'
        }
	}
	public static boolean palindromo(String palavra) {
		palavra = palavra.toLowerCase(); // converte a string para minúsculas
		palavra = palavra.replaceAll("\\s", ""); // remove os espaços em branco
    int n = palavra.length();
    for (int i = 0; i < n / 2; i++) {
        if (palavra.charAt(i) != palavra.charAt(n - i - 1)) {
            return false;
        }
    }
    return true;
}
}
