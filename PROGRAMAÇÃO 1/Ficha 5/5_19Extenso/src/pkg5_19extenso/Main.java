/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_19extenso;

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
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número");
        String numero = ler.nextLine();
        int tamanho = numero.length();
        int percorre = 0;
        while (percorre != tamanho) {
            char caracter = numero.charAt(percorre);
            switch (caracter) {
                case '0':
                    System.out.print("Zero, ");
                    break;
                case '1':
                    System.out.print("um, ");
                    break;
                case '2':
                    System.out.print("dois, ");
                    break;
                case '3':
                    System.out.print("três, ");
                    break;
                case '4':
                    System.out.print("quatro, ");
                    break;
                case '5':
                    System.out.print("cinco, ");
                    break;
                case '6':
                    System.out.print("seis, ");
                    break;
                case '7':
                    System.out.print("sete, ");
                    break;
                case '8':
                    System.out.print("oito, ");
                    break;
                case '9':
                    System.out.print("nove, ");
                    break;

                default:
                    System.out.print("");
                    break;
            }
            percorre++;
        }

    }

}
