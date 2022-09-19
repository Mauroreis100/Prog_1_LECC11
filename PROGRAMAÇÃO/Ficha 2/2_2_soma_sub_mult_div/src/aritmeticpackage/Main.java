package aritmeticpackage;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=Double.parseDouble(JOptionPane.showInputDialog("1º Número"));
		double b=Double.parseDouble(JOptionPane.showInputDialog("2º Número"));
		double soma=a+b;
		double sub=a-b;
		double multipl=a*b;
		double divisao=a/b;
		System.out.println("Sendo A="+a+"e "+"B="+b+"\n"+"A+B="+soma+"\n"+"A-B="+sub+"\n"+"A*B="+multipl+"\n"+"A/B="+divisao);
		

	}

}
