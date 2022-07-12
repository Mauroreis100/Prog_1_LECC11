/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hexagono1_9;
import javax.swing.JOptionPane;
/**
 *
 * @author mauro
 */
public class Hexagono1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double l;
        
        l=Double.parseDouble(JOptionPane.showInputDialog("Qual é a medida de um dos lados do Hexagono?"));

    
        double area = (3*l*Math.sqrt(3))/2;
        
        
        System.out.println("A área do triânulo é ="+area);
    }
    
}
