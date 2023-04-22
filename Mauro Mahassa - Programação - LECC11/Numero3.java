import java.util.Scanner;
import java.util.Arrays;
public class Numero3{
	public static void main(String args[]){
	Scanner ler=new Scanner(System.in);
int involvido=0;
	System.out.println("Telefonou para a vítima? S-sim e N-não");
	char telefonou=ler.next().charAt(0);
		if(telefonou=='s' || telefonou=='S'){
			involvido++;
		}

System.out.println("Esteve no local do crime? S-sim e N-não");
	char crime=ler.next().charAt(0);
		if(crime=='s' || crime=='S'){
			involvido++;
		}

System.out.println("Morar perto da vítima? S-sim e N-não");
	char mora=ler.next().charAt(0);
		if(mora=='s' || mora=='S'){
			involvido++;
		}

System.out.println("Devia para a vítima? S-sim e N-não");
	char txuna=ler.next().charAt(0);
		if(txuna=='s' || txuna=='S'){
			involvido++;
		}

System.out.println("Já trabalhou com a vítima? S-sim e N-não");
	char job=ler.next().charAt(0);
		if(job=='s' || job=='S'){
			involvido++;
		}
if(involvido==2){
System.out.print("Suspeita");
}else if(involvido==3 || involvido==4){
System.out.print("Cúmplice");
}else if(involvido==5){
System.out.print("Assasino");
}else{
System.out.print("Inocente");
}

	}
}