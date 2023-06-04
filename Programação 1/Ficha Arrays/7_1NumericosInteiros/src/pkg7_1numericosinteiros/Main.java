/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_1numericosinteiros;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
Faça um programa em Java que leia um vetor com dez números reais, calcule e mostre a quantidade
* de números negativos 
* e a soma dos números positivos desse vetor.

 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler=new Scanner (System.in);
	public static int contP;
	public static int contImp;
	public static int [] nrs=new int[10];
    
    public static void listaImpares(int nrs[]){
		System.out.println("Os impares deste conjunto sao: ");
		for(int i=0; i<nrs.length; i++){
			
				if(nrs[i]%2!=0){
					System.out.print(nrs[i]+",");
				}
		}	
	}
    	
	public static void obterImpares(int nrs[]){
		for(int i=0; i<nrs.length; i++){
			
				if(nrs[i]%2!=0){
					contImp=contImp+1;
				}
		}
		System.out.println("O conjunto tem "+contImp+" impares");
	}
        public static void listarPares(int [] nrs){
		System.out.print("Os pares que estao no conjunto sao: ");
		for(int i=0; i<nrs.length; i++){		
				if(nrs[i]%2==0){
					System.out.print(nrs[i]+" , ");
				}
		}
                System.out.println();
	}
        public static void preencherVector(int [] nrs){
		for(int i=0;i<nrs.length;i++){
			System.out.println("Insira o "+(i+1)+"o nr: ");
			nrs[i]=ler.nextInt();
		}
	}
		
		
	public static void obterPares(int [] nrs){
		for(int i=0; i<nrs.length; i++){
		
			
				if(nrs[i]%2==0){
					contP=contP+1;
				}
		}
		System.out.println("O conjunto tem "+contP+" nrs pares");
	}
    public static void main(String[] args) {
        preencherVector(nrs);
		obterPares(nrs);
		listarPares(nrs);
		obterImpares(nrs);
		listaImpares(nrs);
        
        
    }
    
}
