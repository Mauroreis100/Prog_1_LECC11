package executa;
import vendedor.Vendedor;
import funcionario.Funcionario;

public class Executa {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Shelton","BI","1234k",123764);
		
		Vendedor v = new Vendedor("ST", "BI", "233j", 1239.23, 0.1);
		System.out.println(v);
		System.out.println(f);
	}

}
