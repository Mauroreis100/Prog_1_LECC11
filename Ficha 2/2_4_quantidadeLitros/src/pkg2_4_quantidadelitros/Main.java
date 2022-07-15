/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_4_quantidadelitros;
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
      //  double tempo=Double.parseDouble(JOptionPane.showInputDialog("Quanto tempo foi gasto?"));
       // double vmedia=Double.parseDouble(JOptionPane.showInputDialog("Qual é a velocidade média atingida pelo carro?"));
        double dist=4*80; //querem velocidade média? Ou as velocidades para encontrar a velocidade media?
        double litrosU=dist/12;
        System.out.print("O carro gasta: "+litrosU+"L");
    }
    
}
