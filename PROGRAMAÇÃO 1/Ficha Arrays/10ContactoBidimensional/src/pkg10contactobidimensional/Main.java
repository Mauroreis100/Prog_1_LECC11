/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10contactobidimensional;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String contacto[][] = new String[6][3];
        contacto[0][0]="Nome";
        contacto[0][1]="Endereco";
        contacto[0][2]="Telefone";
        int a=0;
        
        Scanner ler = new Scanner(System.in);
        for (int i = 1; i < contacto.length; i++) {
            for (int j = 0; j < contacto[i].length; j++) {
                System.out.println("Insira o "+contacto[0][j]);
                contacto[i][j] = ler.nextLine();
            }
        }
        System.out.println("-------------Lista de Contactos----------------");
        for (int i = 1; i < contacto.length; i++) {
            for (int j = 0; j < contacto[i].length; j++) {
                System.out.print(contacto[i][j]+"|\t|");
            }
            System.out.println();
        }

    }

}
