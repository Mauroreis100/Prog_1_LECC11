// Ficha 04 exercício nr 10
import java.util.Scanner;
public class NotaAprovacao{
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		
			for (int i=1;i<=10;i++){
				System.out.println("Insira o nome do estudante");
				String nome=ler.next();
				System.out.println("Insira a nota do primeiro miniteste1 de "+nome);
				int nota1=ler.nextInt();
					if (nota1<0){//nota max 25
						System.out.println("nota invalida"+nota1);
						nota1=0;
					}else if(nota1>25){
						System.out.println("nota invalida"+nota1);
					}	
				System.out.println("Insira nota do teste 1 de "+nome);//nota max 100
				int nota2=ler.nextInt();
					if (nota2<0){
						System.out.println("nota invalida"+nota2);
					}else if(nota2>100){
						System.out.println("nota invalida"+nota2);
					}
				System.out.println("Insira nota do miniteste 2 de "+nome);
				int nota3=ler.nextInt();
					if (nota3<0){
						System.out.println("nota invalida"+nota3);
					}else if(nota3>25){
						System.out.println("nota invalida"+nota3);
					}	
				System.out.println("Insira nota do teste 2 de "+nome);
				int nota4=ler.nextInt();
					if (nota4<0){
						System.out.println("nota invalida"+nota4);
					}else if(nota4>100){
						System.out.println("nota invalida"+nota4);
					}	
				System.out.println("Insira nota do teste 3 de "+nome);
				int nota5=ler.nextInt();
					if (nota5<0){
						System.out.println("nota invalida"+nota5);
					}else if(nota5>100){
						System.out.println("nota invalida"+nota5);
					}	
				System.out.println("Insira nota do teste 4 de "+nome);
				int nota6=ler.nextInt();
					if (nota6<0){
						System.out.println("nota invalida"+nota6);
					}else if(nota6>100){
						System.out.println("nota invalida"+nota6);
					}	
				int soma=nota1+nota2+nota3+nota4+nota5;
				if (soma>=225){
					System.out.println("Estudante "+nome+" aprovou com acumulado de "+soma);
				}else{
					System.out.println("Estudante "+nome+" reprovou com acumulado de "+soma);
				}		
			}		
	}	
}	