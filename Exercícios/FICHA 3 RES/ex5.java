import java.util.Scanner;
import java.lang.Math;

public  class ex5{
	public static void main(String[] args){	
	
	Scanner ler=new Scanner(System.in);	
	double a, b, c;
	double delta;
	double x1;
	double x2;
	
	System.out.println("Insira valor de a");
	a = ler.nextDouble();
		
	System.out.println("Insira valor de b");
	b = ler.nextDouble();
	
	System.out.println("Insira valor de c");
	c = ler.nextDouble();
	delta = Math.pow(b,2)-(4*a*c);
	x1 = (-b-Math.sqrt(delta))/2*a;
	x2 = (-b+Math.sqrt(delta))/2*a;
	
	if(a==0){
	System.out.println("A equacao passara a ser linear com solucao " +-b/c);
	
	}else if(delta<0){
		
		
		System.out.println("Nao tem raizes para conjunto dos nrs reais");
	}else{	
			if(delta==0){
			System.out.println("delta "+delta+" x1=x2 "+x1);
				}else{
				System.out.println("delta "+delta+" x1 "+x1+" x2 "+x2);
				}
			}
		}

}	
    				