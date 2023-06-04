package objecto;

public final class Radio extends Electrodomestico {
	private double sintonia;
	private float volume;
	private final String BANDA_FM = "FM";
	private final String BANDA_AM = "AM";

	public Radio(boolean estaLigado, String marca, float volume, double sintonia) {
		super(estaLigado, marca, volume);
		this.sintonia = sintonia;
		// TODO Auto-generated constructor stub
	}

	public void ligar() {
		setEstaLigado(true);
		super.setVolume(20);
		sintonia = 12;
	}

	public void desligar() {
		setEstaLigado(false);
		volume = 0;
		sintonia = 0;
	}

}
