/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_23iniciais;

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
         // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreve a String");
        String frase = ler.nextLine();
        System.out.println("Escreve a letra argumento");
        char letra = ler.next().charAt(0);
        char percorre;
        int tamanho=frase.length();
        String completo = "";
        for (int i = 0; tamanho!=i; i++) {
            percorre = frase.charAt(i);
            completo = completo+percorre;
            
            
            
            
            
            if (percorre == letra) {
                System.out.println(completo + ",");
            }

        }
        }
    }
    
}
