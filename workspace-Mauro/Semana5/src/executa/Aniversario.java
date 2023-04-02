package executa;
import object.Amigo;
import java.util.Calendar;
public class Aniversario {

	private static Object object;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar rightNow = Calendar.getInstance();
		
Amigo ani=new Amigo("Mauro",'F',12,rightNow);	
System.out.println(ani.toString());}

}
