/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_2reais;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);
    public static double[] a = new double[10];

    public static double[] preencherArray(double nrs[]) {
        for (int i = 0; i < a.length; i++) {  
            System.out.println("Insira o " + (i + 1) + "º nr: ");
            double numero = ler.nextDouble();
            a[i] = numero;
        }

        return a;
    }
     public static void listaNegativos(double nrs[]){
		System.out.println("Os negativos deste conjunto são: ");
		for(int i=0; i<nrs.length; i++){
			
				if(nrs[i]<0){
					System.out.print(nrs[i]+",");
				}
		}	
	}
 public static void somaPositivos(double nrs[]){
		System.out.println("A soma dos números positivos deste conjunto são: ");
                double soma=0;
		for(int i=0; i<nrs.length; i++){
			
				if(nrs[i]>0){
                                    soma=soma+nrs[i];
					
				}
		}
                System.out.print("Soma é "+soma);
	}
    public static void main(String[] args) {
        // TODO code application logic here
        preencherArray(a);
        somaPositivos(a);
        listaNegativos(a);
        
    }

}
