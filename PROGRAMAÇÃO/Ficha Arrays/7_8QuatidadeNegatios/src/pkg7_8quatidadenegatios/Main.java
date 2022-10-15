/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_8quatidadenegatios;
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
  public static int preencherArray(int nrs[]) {
        for (int i = 0; i < nrs.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º nr: ");
            int numero = ler.nextInt();
            nrs[i] = numero;
        }
      
        int qtd = 0;
        for (int i = 0; i < nrs.length; i++) {
            if (nrs[i] < 0) {
                qtd++;
            }
        }
        return qtd;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Quantos numeros pretende inserir?");
        int n = ler.nextInt();
        int[] a = new int[n];
        System.out.println("Temos cá "+ preencherArray(a)+" números negativos");
    }
    
}
