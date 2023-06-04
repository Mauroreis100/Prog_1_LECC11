/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_4tamanhomedia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  public static Scanner ler=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Quantos nrs pretende inserir: ");
		int n=ler.nextInt();
		
		ArrayList<Integer>valor;
		valor=new ArrayList<>();
		preencherArray(n,valor);
                    System.out.print("A media dos valores "+valor+" = "+Media(valor));
		
	}
	
	public static void preencherArray(int n,ArrayList<Integer>valor){
		
		for(int i=0;i<n;i++){
			System.out.println("Insira o "+(i+1)+"o valor");
			valor.add(ler.nextInt());
		}
		
	}
        public static ArrayList teste(){
       ArrayList<Integer> valor=new ArrayList<>();
       return valor;
        }
	
	public static double Media(ArrayList<Integer>valor){
		double media=0;
		int soma=0;
		for(int i=0;i<valor.size();i++){
			soma=soma+valor.get(i);
		}
		media=soma/valor.size();
		return media;
	}

    
}
