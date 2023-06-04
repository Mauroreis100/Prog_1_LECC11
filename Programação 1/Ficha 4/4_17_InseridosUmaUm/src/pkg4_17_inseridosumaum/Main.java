/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_17_inseridosumaum;
import java.util.Scanner;
/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler=new Scanner(System.in);
	int i=1;
	System.out.println("Insira um nr");
	int n=ler.nextInt();
	
		if (n>0){
			while (i<=n){
				System.out.print(i+" ");
				i++;	
				
			}		
		}else{
			System.out.println("Insira um nr positivo");
		}	

    }
    
}
