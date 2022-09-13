import java.util.Scanner;
//Importar a classe scanner
/*Faça um programa para ajudar um trabalhador a saber qual será seu salário semanal,
sabe-se que se ele trabalhar 40 horas ou menos, receberá 1500 mtn por hora, mas se
trabalhar mais de 40 horas, as horas extras serão pagas a 1750 mtn por hora.*/
public class salMensal3
{
public static void main(String args[]){
	
	Scanner ler=new Scanner(System.in);
	//Dando a variavel ler os poderes de acessar input de dados
	System.out.println("Diga quantas horas este trabalhador, trabalhou?");
	double horas=ler.nextDouble();
	double salHora;
	if(horas<=40)
	{
		salHora=1500*horas;
		System.out.println("Este trabalhador irá receber"+salHora+"por semana"+"pois trabalhou <40h");
	}else{
			salHora=1750*horas;
		System.out.println("Este trabalhador irá receber"+salHora+"por semana"+"pois trabalhou >40h");

	}
}
}