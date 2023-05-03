package exercicio4;

public class Reptil extends Animal {

	public Reptil (String nome) {
		super(nome);
	} 
	
	

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.print("emitindo som ");
	}

	
	/*
	 * Pode- se usar o método do String da seguinte forma
	 * public String toString(){super.getNome()+som()}*/
}
