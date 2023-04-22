/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_18perfeito;

/**
 *
 * @author mauro
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 1;
        double nr, soma = 0, media;

        System.out.println("Insira um NÚMERO");
         nr = ler.nextDouble();
        while (i <= nr) {
           
          //  if(){}
            soma += nr;
            i++;
        }
        System.out.println("É perfeito " + soma);
    }
}
