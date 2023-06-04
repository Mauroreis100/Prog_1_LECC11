package inteiros;
import javax.swing.JOptionPane;
public class Inteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(JOptionPane.showInputDialog("1º número a somar"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("2º número a somar"));
		int soma=a+b;
		System.out.print("A soma dos dois números inseridos é igual a "+soma);
	}

}
