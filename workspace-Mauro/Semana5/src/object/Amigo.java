package object;
import java.util.Calendar;
public class Amigo extends Pessoa{
	private Calendar dataAniversario;
	
	public Amigo(String nome, char sexo, float idade, Calendar dataAniversario) {
	super( nome,  sexo,  idade);
		this.dataAniversario=dataAniversario;
	}

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return super.toString()+"\nFez/faz anos no dia " + dataAniversario.get(Calendar.DAY_OF_MONTH)+"/" +
				dataAniversario.get(Calendar.MONTH)+"/"+dataAniversario.get(Calendar.YEAR);
	}

	
}
	
	
	

