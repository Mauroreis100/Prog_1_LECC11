package whatsapp;

/**
 * Classe Bebe com o constutor da super classe : 3 Pontos M�todo desloca : 2
 * Pontos
 * 
 * @author
 *
 */

public class Bebe extends Pessoa {

	public Bebe(int id, String nome, String sexo) {
		super(id, nome, sexo);
	}

	public String desloca() {
		return "BEBE gatinha";
	}
}
