package exercicio3;
import java.util.Scanner;
public class Executa {
public static void main(String[] args) {
	char estado=1;
	Porta porta=new Porta();
	while(estado!=0) {
		System.out.println("0 - SAIR DO PROGRAMA \n 1 - FECHAR PORTA \n 2 - ABRIR PORTA \n 3 - ALTERAR DIMENSÕES \n 4 - VERIFICAR ESTADO");
		switch(estado) {
		case 0: 
			break;
		case 1:
			porta.verificarEstado(false);
		case 2:
			porta.verificarEstado(false);
			break;
		
		}
		
	}
}
}
