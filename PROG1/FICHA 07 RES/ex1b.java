import java.util.Scanner;
public class ex1b{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Insere quantidade de linhas e colunas");
		int y=input.nextInt();
		int x=input.nextInt();
		int [][] M=new int[y][x];
		for (int i=0;i<M.length;i++){
			for(int j=0;j<M[i].length;j++){
				M[i][j]=i*j;
				System.out.print(M[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
}
