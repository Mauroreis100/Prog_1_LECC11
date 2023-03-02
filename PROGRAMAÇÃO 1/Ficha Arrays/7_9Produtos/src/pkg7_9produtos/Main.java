/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_9produtos;

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

    public static void main(String[] args) {
        // TODO code application logic here
        double[] p = new double[5];
        String[] n = new String[5];

        System.out.println("Insira o nome e preços de 5 produtos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome do produto [" + i + "]");
            n[i]=ler.nextLine();
            System.out.println("Preço do produto [" + i + "]");
            p[i] = ler.nextDouble();
            System.out.println("Insira o nome e preços de 5 produtos");
        }
        int qtd=0;
        double soma=0;
        int qtd1000=0;
         for (int i = 0; i < 5; i++) {
             if(p[i]<500){
                 qtd=qtd+1;
             }
             if((p[i]>=500) && (p[i]<=1000)){
                  System.out.println("Nome de produtos com preço entre 500 e 1000"+n[i]+",");
             }
            if((p[i]>1000)){
                 soma=p[i]+soma;
                 qtd1000=1+qtd1000;
             }
        }
         double media=soma/qtd1000;
         System.out.println("A média dos preços dos produtos com preço superior a 1000 é "+media);
    }

}
