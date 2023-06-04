/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_4imparespares;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author mauro
 */
public class Main {

    public static Scanner ler = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static int[] preencherArray(int nrs[]) {
        for (int i = 0; i < nrs.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º nr: ");
            int numero = ler.nextInt();
            nrs[i] = numero;
        }

        return nrs;
    }

    public static void troca(int[] nrs) {
        for (int i = 0; i < nrs.length; i++) {

            if (nrs[i] % 2 == 0) {
                nrs[i] = nrs[i] + 1;
            } else {
                nrs[i] = nrs[i] - 1;
            }
        }

    }

    public static void main(String[] args) {
        /* Crie um método que recebe um array de inteiros positivos e substitui 
               seus elementos de valor ímpar por -1 e os pares por +1.*/
        System.out.println("Quantos numeros pretende inserir?");
        int n = ler.nextInt();
        int[] a = new int[n];
        preencherArray(a);
        System.out.println("Os valores eram: " + Arrays.toString(a));
        troca(a);
        System.out.println("E depois da troca ficou: " + Arrays.toString(a));

    }

}
