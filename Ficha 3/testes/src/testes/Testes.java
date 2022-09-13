/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;



/**
 *
 * @author mauro
 */
import java.util.Scanner;
public class Testes {
public static void main (String[] args) {

 Scanner ler = new Scanner(System.in);
 
System.out.println("Digite 'A' para sorvete tipo A, 'B' para sorvete tipo B e 'C' para sorvete tipo C ");
char sorvete=ler.next().charAt(0);
System.out.println("Quanto custa o sorvete?");
double custo=ler.nextDouble();
double paga;
switch(sorvete){
    case 'a':
        paga=custo-(0.1*custo);
        System.out.println("O cliente irá pagar "+paga+"com 10% de desconto"+custo);
        break;
    default:
        System.out.println("Opção Inválida");
        break;
}


}
}

