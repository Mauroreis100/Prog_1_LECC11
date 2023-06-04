/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_7quantasvezes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Main {

    /*Crie um método que recebe um array de inteiros a e
    um valor inteiro x e retorna a quantidade de vezes 
    que x aparece no array a.
     */
    public static Scanner ler = new Scanner(System.in);

    public static int preencherArray(int nrs[]) {
        for (int i = 0; i < nrs.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º nr: ");
            int numero = ler.nextInt();
            nrs[i] = numero;
        }
        System.out.println("Digite um número que deseja saber a quantidade de ocorrências");
        int m = ler.nextInt();
        int qtd = 0;
        for (int i = 0; i < nrs.length; i++) {
            if (nrs[i] == m) {
                qtd++;
            }
        }
        System.out.print("O número "+m+" aparece ");

        return qtd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quantos numeros pretende inserir?");
        int n = ler.nextInt();
        int[] a = new int[n];
        System.out.println( preencherArray(a)+" vezes");
    }

}
