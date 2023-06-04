package objecto;

public class Administrador extends Funcionario{
private float horasExtras;

public Administrador(String nome, int numeroBi, double salario,float horasExtras) {
super(nome,numeroBi,salario);
	this.horasExtras = horasExtras;
}

public float getHorasExtras() {
	return horasExtras;
}

public void setHorasExtras(float horasExtras) {
	this.horasExtras = horasExtras;
}
public double bonus() {
	return getSalario()*0.20;
}
}
