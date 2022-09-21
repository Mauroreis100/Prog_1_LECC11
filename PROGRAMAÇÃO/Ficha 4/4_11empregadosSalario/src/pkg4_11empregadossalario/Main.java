/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_11empregadossalario;

/**
 *
 * @author mauro
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Numa empresa existem n empregados cujos salários variam entre 25 000 mtn e 200 000.
Execute um programa que relata quantos funcionários ganham menos de 50 000 mtn e
quantos mais de 50 000 mtn. Informe também o total que a empresa gasta com o
pagamento de salários de seus funcionários */
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos funcionários tem a empresa?");
        int qtd = ler.nextInt();
        int i = 0, contM5 = 0, contm5 = 0;
        double soma = 0;
        do {
            System.out.println("Quanto é que o funcionário [" + (i + 1) + "] recebe?\nSabendo que os salários variam entre 25 000 mtn e 200 000mt");
            double salario = ler.nextDouble();

            if (salario >= 25000 && salario <= 200000) {
                if (salario > 50000) {
                    soma += salario;
                    contM5++;
                } else if (salario <= 50000) {
                    soma += salario;
                    contm5++;
                }
            } else {
                System.out.println("INVALIDO");
            }
            i++;
        } while (i < qtd);
        System.out.println(contM5+" funcionários recebem mais de 50000mt e "+contm5+" funcionários recebem menos de 50000mt\nA empresa gasta "+soma+" com salários"); 
    }

}
