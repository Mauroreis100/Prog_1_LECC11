/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_3maiormenor;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> Numeros = new ArrayList();
        System.out.println("Quantos números pretende adicionar a lista?");
        int n=teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número que deseja adcionar na lista:");
            int numero = teclado.nextInt();
            Numeros.add(numero);
        }
        double maximo=Numeros.get(1);
         double minimo=Numeros.get(1);
        for (int i = Numeros.size() - 1; i >= 0; i--) {
            maximo=Math.max(Numeros.get(i), maximo);
            minimo=Math.min(Numeros.get(i), minimo);
        }
        System.out.println("O máximo número da lista é "+maximo+"\nE o mínimo é: "+minimo);
        
    }
    
}
