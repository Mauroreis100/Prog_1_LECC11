package exercicio3;

public class Porta {
	public boolean verificarEstado=false;
	public double x,y;
	
	public boolean fecharPorta() {
		return false;
	}
	public boolean abrirPorta() {
		return true;
	}

	public boolean getVerificarEstado() {
		return verificarEstado;
	}
	public void setVerificarEstado(boolean verificarEstado) {
		this.verificarEstado = verificarEstado;
	}
	public void verificarEstado(boolean estado) {
		if(estado==true) {
			
			verificarEstado=false;
			System.out.println("Porta está fechada");
		}else{
			verificarEstado=true;
			System.out.println("Porta está aberta");
		}
	}
}
