import java.util.Scanner;
public class EqDoSegGrau {
public static boolean Quadrada(double a){
	boolean equacao=false;
	if(a==0) {
		equacao=false;
	}else {
		equacao=true;
	}
	return equacao;
}
public static double Delta(double a,double b, double c) {
	double delta=0;
	if(Quadrada(a)==true) {
	delta=Math.pow(b, 2)-4*a*c;
	}else{
		delta=-c/b;
		System.out.println("a=0 e x="+delta);
	}
	return delta;
	
}
public static void raizes() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
