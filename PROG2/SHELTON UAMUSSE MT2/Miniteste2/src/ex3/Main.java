package ex3;

public class Main {
	public static void main(String[] args) {
		
		Funcionario g = new Gerente("Shelton",10000);
		Funcionario designer = new Designer("Teles",5000);
		Funcionario d = new Desenvolvedor("Karim",7000);
		
		Empresa empresa = new Empresa(3);
		
		empresa.adicionarFunc(g);
		empresa.adicionarFunc(designer);
		empresa.adicionarFunc(d);
		
		//
		System.out.println(empresa.toString());
	}
}
