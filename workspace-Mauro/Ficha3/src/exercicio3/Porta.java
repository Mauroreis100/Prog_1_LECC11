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

	public void verificarEstado(boolean estado) {
		if(estado==true) {
			verificarEstado=false;
		}else{
			verificarEstado=true;
		}
	}
}
