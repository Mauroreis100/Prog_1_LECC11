import java.util.Scanner;
public class ex1{
	public static int t1=1;
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Quantos termos deseja ver :");
		int termos=ler.nextInt();
		
		
		System.out.println("OS termos sao: ");
		
		apresentarT(1,termos);
	}
	
	public static void apresentarT(int i, int termos){
		
		if (i<5 ){	
			i++;
			int j=1;
			System.out.println(j+" ;");
			apresentarT(i,termos);
		}else if(i<termos){
			i++;
			
			t1=t1+2;
			System.out.println(t1+" ;");
			apresentarT(i,termos);
			
		}	
	}	
}