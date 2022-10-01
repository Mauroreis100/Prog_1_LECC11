/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_7areacone;

/**
 *
 * @author mauro
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite a altura do seu cone");
        double altura=ler.nextDouble();
         System.out.println("Digite o raio da base do seu cone");
        double raioBase=ler.nextDouble();
        double volume=(Math.PI*Math.pow(raioBase, 2)*altura)/3;
         System.out.println("O volume do cone é "+volume);
    }
    
}
