/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_8volumecilindro;

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
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite a altura do seu cilindro");
        double altura=ler.nextDouble();
         System.out.println("Digite o raio da base do seu cilindro");
        double raioBase=ler.nextDouble();
        double volume=Math.PI*Math.pow(raioBase, 2)*altura;
         System.out.println("O volume do cilindro é "+volume);
    }
    
}
