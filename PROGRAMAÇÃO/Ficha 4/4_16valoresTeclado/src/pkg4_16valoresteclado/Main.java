/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_16valoresteclado;

/**
 *
 * @author mauro
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     * Desenvolve um programa que permite carregar 10 valores por teclado e depois nos
mostra, os valores inseridos, a sua soma e a sua média desses valores.
     */
    public static void main(String[] args) {
         double valores;
         Scanner leia=new Scanner(System.in);
double a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0;
         for(int i=1;i<=10;i++){
         switch(i){
             case 1:
                 System.out.println("Insira o número da posição["+i+"]");
                  a=leia.nextDouble();
             break;
             case 2:
                 System.out.println("Insira o número da posição["+i+"]");
                  b=leia.nextDouble();
             break;
             case 3:
                 System.out.println("Insira o número da posição["+i+"]");
                  c=leia.nextDouble();
             break;
             case 4:
                 System.out.println("Insira o número da posição["+i+"]");
                  d=leia.nextDouble();
             break;
             case 5:
                 System.out.println("Insira o número da posição["+i+"]");
                  e=leia.nextDouble();
             break;
             case 6:
                 System.out.println("Insira o número da posição["+i+"]");
                  f=leia.nextDouble();
             break;
             case 7:
                 System.out.println("Insira o número da posição["+i+"]");
                  g=leia.nextDouble();
             break;
             case 8:
                 System.out.println("Insira o número da posição["+i+"]");
                  h=leia.nextDouble();
             break;
             case 9:
                 System.out.println("Insira o número da posição["+i+"]");
                  j=leia.nextDouble();
             break;
             case 10:
                 System.out.println("Insira o número da posição["+i+"]");
                  k=leia.nextDouble();
             break;
             default:
                 System.out.println("ERROR 404");
                 break;
         }
         }
        double soma=a+b+c+d+e+f+g+h+j+k;
        double media=soma/10;
        System.out.println("Os valores inseridos foram"+a+", "+b+", "+c+", "+d+", "+e+", "+f+", "+g+", "+h+", "+j+", "+k+"\nAsoma foi de:"+soma+"\nA média foi de:"+media);
    }
    
}
