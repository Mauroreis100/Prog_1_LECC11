/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_14rendimento;

/**
 *
 * @author mauro
 */import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char escolha='c';
        double juro=0;
        Scanner leia=new Scanner(System.in);
        double valor,soma=0;
        for(int i=1;/*(escolha=='c' || escolha=='C')&& */ i<=12;i++){
           // System.out.println("Escreva c para inserir um valor para o mês ["+i+"] da pouopança e outra letra caso queira parar");
            //escolha=leia.next().charAt(0);
            //if(escolha=='c' || escolha=='C' ){
                 System.out.println("Quanto é que vai guardar no mês ["+i+"]");
                valor=leia.nextDouble();
                
              juro=valor*(0.5/100);
                
                double poupanca=valor-juro;
               soma+=poupanca;
           // }
        }
        System.out.println("As suas poupanças no período de 1 ano é:"+soma);
        
    }
    
}
