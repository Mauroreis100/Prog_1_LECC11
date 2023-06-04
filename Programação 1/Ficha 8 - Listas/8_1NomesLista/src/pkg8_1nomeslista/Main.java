/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_1nomeslista;

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
        ArrayList<String> Nomes = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + " que deseja adcionar na lista:");
            String nome = teclado.nextLine();
            Nomes.add(nome);
        }
        for (int i = Nomes.size() - 1; i >= 0; i--) {
            System.out.print(Nomes.get(i) + " ");
        }
    }

}
