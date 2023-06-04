/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_20tresstrings;

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
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite o primeiro nome");
        String primeiro=ler.nextLine();
        String primeiroM=primeiro.toUpperCase();
        System.out.println("Digite o segundo nome");
        String segundo=ler.nextLine();
        String segundoM=segundo.toUpperCase();
        System.out.println("Digite o terceiro nome");
        String terceiro=ler.nextLine(); 
        char first=primeiro.charAt(0);
        char firstM=primeiroM.charAt(0);
        char second=segundo.charAt(0);
        char secondM=segundoM.charAt(0);
        char third=terceiro.charAt(0);
        System.out.println(first+""+second+""+third);
        System.out.println(firstM+"."+secondM+"."+terceiro);
    }
    
}
