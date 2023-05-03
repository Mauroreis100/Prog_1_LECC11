import java.util.Scanner;
public class ex3{
	public static Scanner ler=new Scanner(System.in);
	public static int V[]=new int[10];
	public static int posicao,i=0;
	public static void main(String[] args){
		System.out.println("Insira 10 nrs: ");
		for(int i=0;i<V.length;i++){
			V[i]=ler.nextInt();
		}
		System.out.println("Insira o numero que pretende procurar: ");
		int n=ler.nextInt();
		String msg="";
		for(int i=0;i<V.length;i++){
			if(V[i]==n){
				msg="O nr existe no conjunto";
			}else{
				msg="O nr nao existe no conjunto.";
				posicao=posicao+1;
			}
			i++;
		}
		
		if(msg.equals("O nr existe no conjunto")){
		System.out.println(msg+" na posicao "+posicao);
		}else{
			System.out.println(msg);
		}	
	}
}