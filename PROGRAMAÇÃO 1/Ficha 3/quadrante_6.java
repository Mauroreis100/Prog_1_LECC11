import java.util.Scanner;
 public class quadrante_6{
 public static void main(String[] args){
	 Scanner ler=new Scanner(System.in);
	 System.out.println("Este programa indica o quadrante da cordenada inserida");
	 System.out.println("Insira o ponto no eixo X:");
	 double x=ler.nextDouble();
	 System.out.println("Insira o pono no eixo Y");
	 double y=ler.nextDouble();
	 if(x>0 && y>0){
	 System.out.println("As cordenadas("+x+" , "+y+") estão no I QUADRANTE.");
	 } else if(x<0 && y>0){
		 System.out.println("As cordenadas("+x+" , "+y+") estão no II QUADRANTE.");
	 }else if(x<0 && y<0){
		 System.out.println("As cordenadas("+x+" , "+y+") estão no III QUADRANTE.");
	 } else if(x>0 && y<0) {
		 System.out.println("As cordenadas("+x+" , "+y+") estão no IV QUADRANTE.");
	 } else{
	 System.out.println("As cordenadas("+x+" , "+y+") estão na origem");
	 }
	 
 }
 }