/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_11alturai16;

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
        // TODO code application logic here
        double altura, media, soma = 0;
        char escolha;
        int estudantes;
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos estudantes tem na turma I16");
        estudantes = leia.nextInt();
        for (int i = 1; i <= estudantes; i++) {
            System.out.println("Introduza a altura em: \n C-para centimetros e \n M-para metros");
            escolha = leia.next().charAt(0);
            switch (escolha) {
                case 'C':
                case 'c':
                    System.out.println("Qual é a altura do(a) estudante em centímetros?");
                    altura = leia.nextDouble();
                    soma = soma + altura * 0.01;
                    break;
                case 'M':
                case 'm':
                    System.out.println("Qual é a altura do(a) estudante em metros?");
                    altura = leia.nextDouble();
                    soma = soma + altura;
                    break;
                default:
                    System.out.println("Resposta Inválida");
                    break;
            }
        }
        media=soma/estudantes;
        System.out.println("A média das alturas é"+media+"m \n ou"+media*100+"cm");

    }

}
