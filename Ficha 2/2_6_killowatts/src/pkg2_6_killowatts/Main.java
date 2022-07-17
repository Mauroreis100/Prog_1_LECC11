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
      //  double salarioM=Double.parseDouble(JOptionPane.showInputDialog("Salário Minímo"));
        double kwt=Double.parseDouble(JOptionPane.showInputDialog("Quantos killowatts pretende comprar? killowatts"));
        
        double kwtPmt=((1.7)*4063*1)/100;
        /*A formula vem de produto dos meios é igual ao produto dos extremos
A pergunta que a formula responde é, Se 100kwts equivalem a 1/7 do salario minimo que é igual a 4063 então quanto equivale 1kwt        
        */
        double comprar=kwtPmt*kwt;
        double desconto=comprar-(comprar*(10/100));
        System.out.println("O salário minimo em Junho de 2018 é de 4.063,00MT "+"\n"+"E cada quilowatt equivale a "+kwtPmt+" quilowatt+"+"\n"+"Se o "
                + "cliente comprasse "+kwt+" quilowatt, o cliente iria pagar "+comprar+",00MT. Com um desconto de "+desconto+"mt");
        
    }
    
}
