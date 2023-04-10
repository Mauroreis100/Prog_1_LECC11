package main;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import objecto.DataEscolhida;
public class ClasseMain {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		/*int mes=2;
		int day=2;
		cal.set(Calendar.DAY_OF_MONTH,day);
		cal.set(Calendar.MONTH,mes);
		DataEscolhida data=new DataEscolhida(cal);
		System.out.println(data.toString());
		*/
		
		//Com o simple date format ele pega a data do computador.
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(sdf.format(cal.getTime()));
		
		if(cal.HOUR_OF_DAY>0 && cal.HOUR_OF_DAY<12) {
		System.out.println("BOM DIA: \n"+cal.getTime());
		}else if(cal.HOUR_OF_DAY>=12 && cal.HOUR_OF_DAY<17)
		{
			System.out.println("BOA TARDE: \n"+cal.getTime());
		}else {
			System.out.println("BOA NOITE: \n"+cal.getTime());
					
		}
		}
}
