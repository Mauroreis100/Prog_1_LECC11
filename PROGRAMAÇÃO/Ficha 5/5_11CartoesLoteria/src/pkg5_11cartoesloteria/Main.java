/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_11cartoesloteria;

/**
 *
 * @author mauro
 */
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Random aleatorio=new Random();
        for (int i=1;i<=5;i++){
        int loteria=aleatorio.nextInt(100000,999999);
       System.out.println(i+"º cartão da loteria é: "+loteria);
      // System.out.println("d");
        }
    }
    
}
