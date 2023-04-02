package object;
import java.util.Calendar;
public class Amigo extends Pessoa{
	private Calendar dataAniversario;
	
	public Amigo(String nome, char sexo, float idade, Calendar dataAniversario) {
	super( nome,  sexo,  idade);
		this.dataAniversario=dataAniversario;
	}

	@Override
	public String toString() {
		return super.toString()+"\nAmigo [dataAniversario=" + dataAniversario + "]";
	}

	
}
	
	
	

