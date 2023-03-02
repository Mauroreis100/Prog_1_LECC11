package exemplarObjecto;

public class ArrancaEmpresa {
	public static void main(String[] args) {
		Empresa empresa=new Empresa();
		int ident=234;
		String name="Cúduro";
		String ender="Coop";
		empresa.setId(ident);
		empresa.setEndereco(ender);
		empresa.setNome(name);
		System.out.println(empresa.getId());
	}

}
