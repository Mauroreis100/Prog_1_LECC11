package mainThrow;

public class Atirando {

	public static void main(String[] args) {
			System.out.println();
			pagarPropina(-900);
	}
	private static double valorAPagar;
	public static void pagarPropina(double valor)
	{
		if(valor < 0)
		{
			throw new NumeroInvalidoException("O valor deve ser maior que 0, voce passou o valor: "+ valor);
		} else
		{		
			valorAPagar = valorAPagar + valor;
		}
	}

}
