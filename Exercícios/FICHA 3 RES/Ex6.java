import java.util.Scanner;
public class Ex6{
	public static void main(String[] args){
	
	Scanner ler=new Scanner(System.in);
	double x, y;
	
	  System.out.println("Insira valor nao nulo para x: ");
	  x= ler.nextDouble();
	  
	  System.out.println("Insira o valor nao nulo para y: ");
	  y= ler.nextDouble();
		
		if(x>0 && y>0){
			System.out.println("As coordenadas pertencem ao primeiro quadrante");
		}else if(x<0 && y>0){
			System.out.println("As coordenadas pertencem ao segundo quadrante");
		}else if(x<0 && y<0){
			System.out.println("As coordenadas pertencem ao terceiro quadrante");
		}else if(x>0 && y<0){
			System.out.println("As coordenadas pertencem ao quarto quadrante");
		}else{
			System.out.println("Insira valores validos");
		
		}
	
	}
}