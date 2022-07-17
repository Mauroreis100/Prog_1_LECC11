/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_9_meses;
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
        int opcao=0;
        String menu="Insira o número correspondente ao mês do ano."+"\n"+"Caso pretenda sair do programa pressione 0";
        do{
            opcao=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao){
                case 0:{
                    System.exit(0);
                }break;
                case 1:{
                    System.out.print("JANEIRO"+"\n");
                }break;
                case 2:{
                     System.out.print("FEVEREIRO"+"\n");
                }break;
                case 3:{
                     System.out.print("MARÇO"+"\n");
                }break;
                case 4:{
                     System.out.print("ABRIL"+"\n");
                }break;
                 case 5:{
                     System.out.print("MAIO"+"\n");
                }break;
                 case 6:{
                     System.out.print("JUNHO"+"\n");
                }break;
                 case 7:{
                     System.out.print("JULHO"+"\n");
                }break;
                 case 8:{
                     System.out.print("AGOSTO"+"\n");
                }break;
                 case 9:{
                     System.out.print("SETEMBRO"+"\n");
                }break;
                 case 10:{
                     System.out.print("OUTUBRO"+"\n");
                }break;
                 case 11:{
                     System.out.print("NOVEMBRO"+"\n");
                }break;
                 case 12:{
                     System.out.print("DEZEMBRIO"+"\n");
                }break;
                default:{
                     System.out.print("INVÁLIDO"+"\n");
                }break;
            }
        }while(opcao!=0);
}
    }
    

