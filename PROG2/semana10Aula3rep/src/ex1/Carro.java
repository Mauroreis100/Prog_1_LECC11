package ex1;

public class Carro extends Veiculo {

	
	
	
	public Carro( ) {
		super();
		// TODO Auto-generated constructor stub
	}


	public void acelerar() {
		// TODO Auto-generated method stub
		
		super.setVelocidade(getVelocidade()+20); ;
		
	}

	


	public int frear() {
		// TODO Auto-generated method stub
		
		return -10;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getVelocidade()+"";
	}
		

}
