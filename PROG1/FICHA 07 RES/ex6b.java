import java.util.Scanner;
public class ex6b{
	public static int V[][]=new int [3][3];
	public static Scanner ler=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Preencha a matriz 3x3: ");
		
		for(int i=0;i<3;i++){
			System.out.println("Preencha a linha "+(i+1));
			for(int j=0;j<3;j++){
				System.out.println("Preencha a coluna "+(j+1));
				V[i][j]=ler.nextInt();
			}
		}
	visualizarV(V);
	multiplicar(V);
	visualizarV1(V);
	}

	
		
		public static void visualizarV(int V[][]){
			System.out.println("A matriz: ");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print(V[i][j]+" ");
				}
				System.out.println();
			}
		}	
			
		public static void multiplicar(int V[][]){
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						V[i][j]=V[i][j]*5;
					}
				}
			}
		public static void visualizarV1(int V[][]){
			System.out.println("A matriz depois da multiplicacao: ");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print(V[i][j]+" ");
				}
				System.out.println();
			}
	}
}