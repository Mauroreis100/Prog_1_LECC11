package executa;
import object.Amigo;
import java.util.Calendar;
public class Aniversario {

	private static Object object;

	public static void main(String[] args) {
Calendar DataAniversario = Calendar.getInstance();
		
		/*
		DataAniversario.set(21,1,2007);
		*/
		DataAniversario.set(Calendar.DAY_OF_MONTH,21);
		DataAniversario.set(Calendar.MONTH,3);
		DataAniversario.set(Calendar.YEAR, 2004);

		Amigo a = new Amigo("St",'M',(short) 12,DataAniversario);
		
		
		System.out.println(a.toString());


}
	}