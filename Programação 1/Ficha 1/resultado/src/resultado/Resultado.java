/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resultado;
import java.util.Scanner;
/**
 *
 * @author mauro
 */
public class Resultado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner ler = new Scanner(System.in);
       int dia,hora,extra;
String name;
System.out.println("Nome");
name=ler.next();
System.out.println("Quantos dias rabalhou?");
	dia=ler.nextInt();
System.out.println("Número de horas extras que trabalhou");
extra=ler.nextInt();
hora=dia*8+extra;
if(hora<=40) {
System.out.println(name+" Irá receber 1500mt p/ hora com "+dia+"dias, "+hora+"horas trabalhadas em"+extra+" horas extras");
}else {
System.out.println(name+"Irá receber 1750mt p/ hora"+dia+"dias, "+hora+"horas trabalhadas em"+extra+" horas extras");
}
    }
    
}
