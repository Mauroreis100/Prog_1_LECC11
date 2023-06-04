package objecto;
import java.util.Calendar;
public class DataEscolhida {
	private Calendar dataAniversario;

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public DataEscolhida(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return "Dia:" + dataAniversario.get(Calendar.DAY_OF_MONTH) + "\nMês: "+dataAniversario.get(Calendar.MONTH);
	}
	
}
