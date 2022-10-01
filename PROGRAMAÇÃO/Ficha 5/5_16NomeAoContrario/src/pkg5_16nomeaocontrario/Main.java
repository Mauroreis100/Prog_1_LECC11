/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_16nomeaocontrario;

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
        Scanner ler=new Scanner(System.in);
        System.out.println("Escreve o seu nome.\nPode ser em maiusculas ou minusculas.");
        String nome=ler.nextLine();
        String virado="";
        String maiu=nome.toUpperCase();
        for(int i=0;i<maiu.length();i++){
            char contrario=maiu.charAt(i);
             virado=contrario+virado;
            
        }
        System.out.println(virado);
    }
    
}
