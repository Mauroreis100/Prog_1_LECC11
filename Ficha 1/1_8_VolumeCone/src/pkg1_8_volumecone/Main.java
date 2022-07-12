/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_8_volumecone;

import javax.swing.JOptionPane;

/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                double r = Double.parseDouble(JOptionPane.showInputDialog("Diga qual é o raio da base do cone?"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Diga qual é a altura do cone?"));
        double volume = (Math.PI*Math.pow(r, 2)*h)/3;
        System.out.println("O volume do cone é "+volume);
    }
    
}
