package circulo;

public class Circulo {
	private double raio;
	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		} else {
			System.out.println("Raio é menor que 0");
		}
	}

	public double calcularPerimetro() {
		return Math.PI * 2 * raio;
	}

	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", Perimetro=" + calcularPerimetro() + ", Area="
				+ calcularArea() + "]";
	}

}
