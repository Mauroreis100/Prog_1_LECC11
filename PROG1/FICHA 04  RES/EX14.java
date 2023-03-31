import java.util.Scanner;
public class EX14{
public static void main(String[] args){

Scanner ler=new Scanner(System.in);
double valorDepos, juro=0.005,valorFinal;
int temp=1;

	System.out.println("Insira o valor depositado");
	valorDepos=ler.nextDouble();
	
		for(int i=1;i<=12;i++){
			valorFinal=valorDepos+(valorDepos*juro*temp);
			System.out.println("O valor depositado no ano "+temp+" e "+valorFinal);
			temp++;
		}
}
}