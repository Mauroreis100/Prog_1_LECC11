import java.util.Scanner;
public class Perfeito{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int n, soma, d;
	d= 0;//visto que a posicao de d e 12, deve inicializar a variavel a  0
	soma=0;
	System.out.println("Insira um nr para saber se e perfeito");
	n=ler.nextInt();
	
		while (d<n){
		d++;
			if(n%d==0){
			soma+=d;
			
			}
	
		}
		if(soma==d){
			System.out.println("O nr e perfeito");
		}else{
		System.out.println("Nao e perfeito");
		}
	}
	
}	
