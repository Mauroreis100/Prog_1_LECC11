package pckgcilindro;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r=Double.parseDouble(JOptionPane.showInputDialog("Raio da base"));
		double h=Double.parseDouble(JOptionPane.showInputDialog("Altura do cilindro"));
		double volume=Math.PI*Math.pow(r, 2)*h;
		/*double area= Area do cylinder? https://pt.slideshare.net/logosacademyeduec/area-y-volumen-de-cilindros*/
		System.out.println(volume);
	}

}
