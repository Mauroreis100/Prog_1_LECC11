package whatsapp;

/**
 * Classe Adulto com constutor da super classe : 3 pontos
 * M�todo desloca : 2 pontos 
 * @author 
 *
 */

public class Adulto extends Pessoa{

	public Adulto(int id, String nome, String sexo) {
		super(id, nome, sexo);
	}
	
	public String desloca()
	{
		return "Pessoa adulta anda";
	}

}
