package whatsapp;

/**
 * 4 Objectos 2 bebe, 2 adulto, chamar o m�todo desloca para cada um : 5 Pontos 
 * M�todo verificaSexo : 5 Pontos 
 * @author
 *
 */

public class Executa {
	public static void main(String[] args) {
		
		Executa executa = new Executa();
		Bebe bebe1 = new Bebe(1, "Mateus", "Masculino");
		Bebe bebe2 = new Bebe(2, "Fabio", "Masculino");
		
		Adulto adulto1 = new Adulto(3, "Valter", "Masculino");
		Adulto adulto2 = new Adulto(4, "Ana", "Femenino");
		
		bebe1.desloca();
		bebe2.desloca();
		
		adulto1.desloca();
		adulto2.desloca();
		
		Pessoa[] pessoas = new Pessoa[4];
		pessoas[0] = bebe1;
		pessoas[1] = bebe2;
		pessoas[2] = adulto1;
		pessoas[3] = adulto2;
		
		System.out.println(executa.verificaSexo(pessoas));
		
	}
	
	public String verificaSexo(Pessoa[] pessoas)
	{
		int masculino=0;
		int femenino=0;
		
		for(int i =0;i<pessoas.length;i++)
		{
			if(pessoas[i].getSexo().equalsIgnoreCase("Femenino"))
			{
				femenino++;
			}
			else if(pessoas[i].getSexo().equalsIgnoreCase("Masculino"))
			{
				masculino++;
			}
		}
		return "O total de pessoas do Sexo Masculino: " + masculino + 
		" O total de pessoas do Sexo Femenino: "+femenino;
	}
}
