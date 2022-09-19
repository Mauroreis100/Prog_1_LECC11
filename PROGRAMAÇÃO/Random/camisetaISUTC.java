/* Suponha que um restaurante esteja disposto a patrocinar com camisetas todos os fãs da equipa de Futebol do ISUTC, 
quando a equipa estiver a ganhar em casa e marcar pelo menos 5 golos, em qualquer jogo disputado no campeonato. 
Desenvolva um programa que mostre a seguinte mensagem quando essa 
condição for satisfeita: troque seu bilhete por uma camiseta. 
Ou "Não foi desta vez, faremos melhor no próximo jogo".
*/

import java.util.Scanner;

public class camisetaISUTC{
public static void main(String args[]){
	Scanner golo=new Scanner(System.in);

	char respGanhar;
	System.out.println("Está a jogar em casa? \n Escreva s para sim \n e Escreva n para não");
	respGanhar=golo.next().charAt(0);
	
	System.out.println("Quantos golos marcou?");
	int nrGolos=golo.nextInt();
	
	if(respGanhar=='s' && nrGolos>=5){
		System.out.println("Troque seu bilhete por uma camiseta.");
	}else{
		System.out.println("Não foi desta vez, faremos melhor no próximo jogo");
	}
	
		
	
/*	System.out.println("Está a jogar em casa? ");
	char respGanhar;
	respGanhar=golo.next().charAt(0);
	
if (respGanhar=='s'){
	System.out.println("Quantos golos marcou?");
	int golos=golo.nextInt();
	
if(golos>=5){
	System.out.println("Troque seu bilhete por uma camiseta.");
}else{
System.out.println("Não foi desta vez, faremos melhor no próximo jogo");	
}
	
}else if(respGanhar=='n'){
	System.out.println("Não foi desta vez, faremos melhor no próximo jogo");
	*/
}
}
