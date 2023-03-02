/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somatoriorecursivo;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class SomatorioRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        System.out.println("Somatórios de 1 a n. Digite n:");
        System.out.print(somatorio(ler.nextInt()));
    }

    public static int somatorio(int n) {
    
        if (n == 0) {
            return 0;
        } else {
            return n + somatorio(n - 1);
        }
    }
}
