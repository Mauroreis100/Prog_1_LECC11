/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_7primeiraocorrencia;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*Escreva um método que recebe um array de inteiros a e devolve um array de 	
    boolean onde, cada posição indique true se o elemento da posição 	
    correspondente de a é positivo e false caso seja negativo ou zero.*/
    public static Scanner ler = new Scanner(System.in);

    public static boolean[] preencherArray(int nrs[]) {
        boolean[] logico = new boolean[nrs.length];
        for (int i = 0; i < nrs.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º nr: ");
            int numero = ler.nextInt();
            nrs[i] = numero;
        }
        for (int i = 0; i < nrs.length; i++) {
            if (nrs[i] > 0) {
                logico[i] = true;
            } else if (nrs[i] <= 0) {
                logico[i] = false;
            }
        }
       
        return logico;
    }

    public static void main(String[] args) {
        System.out.println("Quantos números pretende inserir?");
        int n = ler.nextInt();
        int[] a = new int[n];
        System.out.println("Os valores são correspondem a : " + Arrays.toString(preencherArray(a)));

    }

}
