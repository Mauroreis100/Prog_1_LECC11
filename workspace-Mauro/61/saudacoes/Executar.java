package saudacoes;

import java.util.Calendar;

public class Executar {

	public static void main(String[] args) {
		
		Calendar a = Calendar.getInstance();
		
		Operacoes op = new Operacoes(a);
		op.saudacao();
		op.diasMes();
		op.semanasAno();
		op.data();
		op.horas();
	}

}
