package mainThrow;

public class NumeroInvalidoException extends RuntimeException{
	/**
	 * Devemos sempre identificar que tipo de erro é esse, que queremos lidar
	 */
	public NumeroInvalidoException (String mensagem) {
		super(mensagem);
	}
}
