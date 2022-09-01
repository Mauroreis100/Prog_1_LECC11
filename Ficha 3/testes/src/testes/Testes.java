/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, x1, x2, delta;

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor de a");
        a = ler.nextDouble();
        System.out.println("Insira o valor de b");
        b = ler.nextDouble();
        System.out.println("Insira o valor de c");
        c = ler.nextDouble();
        if (a == 0) {
            x1 = (-c / b);
            System.out.println("Teremos uma equação linear quando a=0, com o resultado" + x1);
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Não teremos raízes reais");
            } else {
                if (delta == 0) {
                    x1 = (-b + Math.sqrt(delta)) / 2 * a;
                    System.out.println("Teremos apenas uma unica solução, onde x1 e x2 será igual a " + x1);
                } else {
                    x1 = (-b + Math.sqrt(delta)) / 2 * a;
                    x2 = (-b - Math.sqrt(delta)) / 2 * a;
                    System.out.println("Teremos uma função quadrática com a=" + a + ", b=" + b + " e c=" + c + "com x1=" + x1 + " e " + "x2=" + x2);
                }
            }

        }

    }
}
