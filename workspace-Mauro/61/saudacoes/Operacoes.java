package saudacoes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Operacoes {
	
	private Calendar agora;

	public Operacoes(Calendar agora) {
		this.agora = agora;
	}

	public Calendar getAgora() {
		return agora;
	}

	public void setAgora(Calendar agora) {
		this.agora = agora;
	}
	
	public void saudacao() {
		if (agora.get(Calendar.HOUR_OF_DAY) < 12 && agora.get(Calendar.HOUR_OF_DAY) > 0) {
			System.out.println("Bom dia");
		}
		else if (agora.get(Calendar.HOUR_OF_DAY) >= 12 && agora.get(Calendar.HOUR_OF_DAY) < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
	}
	
	public void diasMes() {
		System.out.println(agora.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
	public void semanasAno() {
		System.out.println(agora.getActualMaximum(Calendar.WEEK_OF_YEAR));
	}
	
	public void data() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(agora.getTime()));
	}
	
	public void horas() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		System.out.println(sdf.format(agora.getTime()));
	}
}
