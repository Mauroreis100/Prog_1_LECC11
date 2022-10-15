/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_3posicao;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author mauro
 */

public class Main {

    public static Scanner ler = new Scanner(System.in);
    public static int[] a = new int[10];

    /**
     * @param args the command line arguments
     */
    public static int[] preencherArray(int nrs[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º nr: ");
            int numero = ler.nextInt();
            a[i] = numero;
        }

        return a;
    }

    /*Faça um programa que para um vetor de 10 elementos positivos e em seguida
encontre a posição no vetor de um elemento informado pelo usuário, 
caso o elemento não exista no vetor, informe o usuário*/
    public static int procura(int n) {
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
               j=i;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        preencherArray(a);
        System.out.println("Digite o número que proucra dentro do vector");
        int numero = ler.nextInt();

        
       if(a[procura(numero)]==numero){
       System.out.print("O número que procura ocupa a posição: "+procura(numero)+"");
       }else{
           System.out.print("O número que procura está não foi encontrado");
       }
    }

}
