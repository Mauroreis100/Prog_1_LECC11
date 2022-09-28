/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_15palpite;

/**
 *
 * @author mauro
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler=new Scanner(System.in);
        Random aleatorio=new Random();
      int k=aleatorio.nextInt(1001);
      int i=1;
      System.out.println("Insira o teu palpite");
      int j=ler.nextInt();
      
      while(j!=k){
      if(j>k){
          System.out.println("Maior");
          
      }else{
      System.out.println("Menor");
      }
      i++;
      System.out.println("Insira o teu palpite");
      j=ler.nextInt();
      }
      System.out.println("Tentou "+i+" vezes\nO número é "+k);
    }
    
}
