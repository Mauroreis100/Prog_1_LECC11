/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_13tabuada;

/**
 *
 * @author mauro
 */import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
	int n=1, i;
	System.out.println("Insira um nr de 1 a 10");
	n=ler.nextInt();
		if(n<=10){
			for(i=1;i<=10;i++){
				
				System.out.println(n+" X "+i+" = "+n*i);

			}	
			
		}else{
			System.out.println("Insira um nr de 1 a 10!!");
		}

    }
    
}
