import java.lang.Math;
public class Arredondar {
	public static void main (String Args[]){
		double x=5.2, y=5.6, z=-5.8;
		double r = Math.floor(x);
		double r1 = Math.floor(y);
		double r2= Math.ceil(z);
		//Como é negativo o número anterior a ele?
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
	}
}
