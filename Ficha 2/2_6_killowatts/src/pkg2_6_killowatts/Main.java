/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_6_killowatts;
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
        double salarioM=Double.parseDouble(JOptionPane.showInputDialog("Salário Minímo"));
        double kwt=Double.parseDouble(JOptionPane.showInputDialog("Killowatts"));
        
        double kwtPmt=((1.7)*4063*1)/100;
        double comprar=kwtPmt*kwt;
        
    }
    
}
