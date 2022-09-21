/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10estudantes;

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
        Scanner ler = new Scanner(System.in);
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira o nome do estudante " + "[" + i + "]");
            String nome = ler.next();
            System.out.println("Insira a nota do Estudante: " + nome + " [" + i + "]");
            int nota = ler.nextInt();

            if (nota >= 225) {
                System.out.println("Estudante " + nome + " aprovou com acumulado de " + nota);
                a++;
            } else {
                System.out.println("Estudante " + nome + " reprovou com acumulado de " + nota);
                b++;
            }
        }
        System.out.println("Dos 10 estudantes na turma: \n" + a + " Estudantes aprovaram e " + b + " Estudantes reprovatam");
    }

}
