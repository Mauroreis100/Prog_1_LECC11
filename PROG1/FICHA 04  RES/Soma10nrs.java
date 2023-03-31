/*
22. Desenvolva um programa que permita o carregamento de 10 valores pelo teclado e
posteriormente nos mostre a soma dos valores inseridos e sua média
*/

import java.util.Scanner;
public class Soma10nrs{
	public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	
	int i=1;
	double nr,soma=0,media;
	
	System.out.println("Insira um 10 nr");
	while(i<=10){
	nr=ler.nextDouble();
	soma+=nr;
	i++;
	}
	System.out.println("O resultado da operacao e "+soma);
	}
}