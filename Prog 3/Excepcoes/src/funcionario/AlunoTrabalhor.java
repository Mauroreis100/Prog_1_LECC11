package funcionario;

public class AlunoTrabalhor extends Funcionario {
	int horas;

	public void setHoras(int horas) {
		if (horas > 0 && horas < 160) {
			this.horas = horas;
		} else {
			throw new HoraInvalidaException(
					"ERROR 404\n SALÁRIOD DEVE SER" + "MAIOR QUE 0 e MENOR QUE 160\n " + horas + " NÃO ACEITE");
		}
	}
}
