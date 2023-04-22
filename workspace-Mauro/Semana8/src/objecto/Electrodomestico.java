package objecto;

public abstract class Electrodomestico {
private boolean estaLigado;
private String marca;
private float volume;
public Electrodomestico(boolean estaLigado, String marca, float volume) {
	this.estaLigado=estaLigado;
	this.marca=marca;
	this.volume=volume;
}
public boolean isEstaLigado() {
	return estaLigado;
}
public void setEstaLigado(boolean estaLigado) {
	this.estaLigado = estaLigado;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public float getVolume() {
	return volume;
}
public void setVolume(float volume) {
	this.volume = volume;
}
public abstract void ligar();
public abstract void desligar();

}
