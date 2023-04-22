/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_10media;

/**
 *
 * @author mauro
 */
import java.util.Scanner;

public class Main {

    /**
     * 9.Programa em Java para calcular soma, média e quantidade de n números
     * digitados
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char resp = 'C';
        int cont = 1;
        int numero, soma = 0, i = 0;
        double media;

        while (resp=='C' || resp=='c') {
            System.out.println("Digite C caso deseje continuar e se quiser parar escreva uma letra diferente de C");
              resp = leia.next().charAt(0);
           // cont = leia.nextInt();
             System.out.println(resp);
            if (resp=='C' || resp=='c') {
                System.out.println(resp);
                System.out.print("Digite um numero");
                numero = leia.nextInt();

                soma = soma + numero;
                i++;

            }

        }
        if (i != 0) {
            media = (soma) / i;
            System.out.println("Soma=" + soma + "\n" + "Média=" + media  + "\n" + i + " Números foram inseridos");
        } else {
            System.out.println("Nem um núemro foi inserido");
        }
    }

}
