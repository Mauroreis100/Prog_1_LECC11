/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos apresentada abaixo. Escreva um programa calcule e imprima  o valor a ser pago pelo cliente sabendo-se
sabendo-se que o preço do litro da gasolina é 72,49Mt e o preço do litro do álcool é 69,90mts. Serao fornecidos a quantidade de litros vendidos e o tipo de combustível
conforme os códigos: D-Diesel, G-gasolina)
*/
import java.util.Scanner;
public class mtperg2{
	public static void main(String [] args){
	Scanner ler=new Scanner(System.in);
		double D=69.9, G=72.49, desc, precoI=0,precoF=0,quant;
		char tipoComb;
		
		System.out.println("Selecione gasolina ou diesel! G ou D. E insira a quantidade em litros");
		tipoComb=ler.next().charAt(0);
		quant=ler.nextDouble();
		
		if (tipoComb=='G'){
			precoI=G*quant;
				if (quant<=20){
					desc=0.04;
					precoF=precoI-(precoI*desc);
					
				}else if (quant>20){
					desc=0.06;
					precoF=precoI-(precoI*desc);
				}	
				System.out.println("O valor a pagar e "+precoF);	
				
		}else{ //acrescentar o else que corresponderia ao opcao invalido
			precoI=D*quant;
				if (quant<=20){
					desc=0.03;
					precoF=precoI-(precoI*desc);
					
				}else if (quant>20){
					desc=0.05;
					precoF=precoI-(precoI*desc);
				}	
				System.out.println("O valor a pagar e "+precoF);
		}	
	
	}

}// repetir com possiblidade de limitar ao usuario se colocar opcao errada