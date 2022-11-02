import java.util.*;
public class ex6{
	public static Scanner ler=new Scanner(System.in);
	public static int soma=0;
	public static double media=0;
	public static void main(String[] args){
		System.out.println("Insira numeros inteiros. Para para de inserir escreva -99 ");
		int n;
		ArrayList<Integer>numero=new ArrayList<>();
		
		int para=0,j=0;
		
		while(para != -99){
			System.out.println("Insira o "+(j+1)+"o numero");
					para=ler.nextInt();
					numero.add(para);
					j=j+1;
		}
		numero.remove(numero.size()-1);
		System.out.println("Foram inseridos "+numero.size()+" numeros");
		System.out.println("O conjunto e formado pelos nrs: "+numero+" a soma="+somar(numero)+" e a media e "+acharMedia(numero,soma));
		informarMaior(numero,media);
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
}