import java.util.*;
public class ex2{
	public static Scanner ler=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Insira a quantidade de nrs que pretende inserir: ");
		int n=ler.nextInt();
		
		ArrayList<Integer>nrs=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			System.out.println("Insira o "+(i+1)+"o nr: ");
			nrs.add(ler.nextInt());
			
		}
		acharMaior(nrs);
		acharMenor(nrs);
		
	}
	
	public static void acharMaior(ArrayList<Integer>nrs){
		System.out.print("O maior valor da lista e: ");
		int maior=nrs.get(0);
		for(int i=1;i<nrs.size();i++){
			if(nrs.get(i)>nrs.get(0)){
				maior=nrs.get(i);
			}
		}
		System.out.println(maior);
	}
	
	public static void acharMenor(ArrayList<Integer>nrs){
		System.out.print("O menor valor da lista e: ");
		int menor=nrs.get(0);
		for(int i=1;i<nrs.size();i++){
			if(nrs.get(i)<nrs.get(0)){
				menor=nrs.get(i);
			}
		}
		System.out.print(menor);
	}	
	
}