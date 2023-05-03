import java.util.*;
public class ex10{
	public static Scanner ler=new Scanner(System.in);
	public static int soma=0;
	public static double media=0;
	public static void main(String[] args){
		ArrayList<Integer>numero=new ArrayList<>();
		int j=0, para=0;
		
		while(para != -1){
			System.out.println("Insira o "+(j+1)+"o numero");
					para=ler.nextInt();
					numero.add(para);
					j=j+1;
		}
		numero.remove(numero.size()-1);
		System.out.println("Foram inseridos "+numero.size()+" valores");
		System.out.println("Na ordem do usauario foram inseridos os seguints valores: "+numero);
		System.out.println("");
		System.out.println("Na ordem do inversa foram inseridos os seguints valores: ");
		for(int i=numero.size()-1;i>=0;i--){
			System.out.print(" "+numero.get(i));
		}
		System.out.println("");
		System.out.println("A soma="+somar(numero)+" e a media e "+acharMedia(numero,soma));
		informarMaior(numero,media);
		acharMenor7(numero);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Processo encerrado");
		
		
	}

	public static int somar(ArrayList<Integer>numero){
		for(int i=0;i<numero.size();i++){
			soma=soma+numero.get(i);
		}
		return soma;
	}
	
	public static double acharMedia(ArrayList<Integer>numero,int soma){
		media=soma/numero.size();
		return media;
	}
	
	public static void informarMaior(ArrayList<Integer>numero,double media){
		int contMaior=0;
		for(int i=0;i<numero.size();i++){
			if(media<numero.get(i)){
				contMaior=contMaior+1;
			}
		}
		System.out.println("A quantidade de nrs maiores que a media e: "+contMaior);
	}

	public static void acharMenor7(ArrayList<Integer>numero){
		int contMenor=0;
		for(int i=0;i<numero.size();i++){
			if(numero.get(i)<7){
				contMenor=contMenor+1;
			}
		}	
			System.out.println("A quantidade de nrs menores que sete e: "+contMenor);
	}	
}