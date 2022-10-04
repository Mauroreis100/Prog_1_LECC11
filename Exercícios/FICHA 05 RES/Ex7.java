import java.util.Scanner;
import java.lang.Math;
public class Ex7{
public static void main(String args[]){
Scanner ler=new Scanner(System.in);
//Cálculo volume de cone

double V,h,r;
System.out.println("Insira o valor da altura e do raio");
h=ler.nextDouble();
r=ler.nextDouble();

V=(h*Math.PI*Math.pow(r,2))/3;//opcional r*r
System.out.println("V= "+V);	


}
}