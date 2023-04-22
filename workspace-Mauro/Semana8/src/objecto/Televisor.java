package objecto;

public final class Televisor extends Electrodomestico{
	public String referencia;
	public float canal;
	public Televisor(boolean estaLigado, String marca,float volume,String referencia,float canal) {
		super(estaLigado,marca,volume);
		this.canal=canal;
		
		// TODO Auto-generated constructor stub
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public float getCanal() {
		return canal;
	}
	public void setCanal(float canal) {
		this.canal = canal;
	}

	public void ligar() {
		setEstaLigado(true);
		setVolume(2);
		canal=12;
	}
	/**
	 *
	 */
	public void desligar() {
		setEstaLigado(false);
		setVolume(0);
		canal=0;
	}
}
