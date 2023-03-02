/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_5_brutoliquido;
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
        double salHora=148;
        double horas=168;
        double desconto=9.17*0.01;
        double salariobruto=salHora*horas;
        double saLiquido=salariobruto-(desconto*salariobruto);
        System.out.print("O salário liquido do desempregado é = "+saLiquido +"\n"+"E p sálario bruto é "+salariobruto);
        
    }
    
}
