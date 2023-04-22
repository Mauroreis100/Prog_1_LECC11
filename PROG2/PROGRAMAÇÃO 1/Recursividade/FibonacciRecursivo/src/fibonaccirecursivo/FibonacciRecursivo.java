/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccirecursivo;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class FibonacciRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos números da sequência de Fibonacci pretende ver?");
        System.out.print(fibonacci(ler.nextInt()));

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
