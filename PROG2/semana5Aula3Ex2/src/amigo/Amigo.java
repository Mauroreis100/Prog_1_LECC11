package amigo;

import java.util.Calendar;

import pessoa.Pessoa;

public class Amigo extends Pessoa {
	private Calendar dataAniversario;

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Amigo(String nome, String sexo, short idade,Calendar dataAniversario) {
		super(nome,sexo, idade);
		this.dataAniversario = dataAniversario;
	}

	
	public String toString() {
		
		return " Amigo dataAniversario= " + dataAniversario.get(Calendar.DAY_OF_MONTH)+"/" +
		dataAniversario.get(Calendar.MONTH)+"/"+dataAniversario.get(Calendar.YEAR) ;
	}
	
	
	
	

	//colocar essa instancio no metodo main
	//Calendar DataAniversario = Calendar.getInstance();
	
	
}
