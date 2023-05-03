import java.util.Random;
public class lancamentoDado{
	public static void main(String[] args){
		Random r=new Random();
		
		System.out.println("Lancamento do dado: ");
		
		for(int i=1;i<=10;i++){
			int dado=r.nextInt(7);
			if(dado!=0){
				System.out.println(i+"o lancamento ="+dado);
			}	
		}
		
	}
}