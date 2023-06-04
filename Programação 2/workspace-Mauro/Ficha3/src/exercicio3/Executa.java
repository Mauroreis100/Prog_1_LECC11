package exercicio3;
import java.util.Scanner;
public class Executa {
public static void main(String[] args) {
	int estado=0;
	Scanner ler=new Scanner(System.in);
	Porta porta=new Porta();
	do {
		System.out.println("0 - SAIR DO PROGRAMA \n 1 - FECHAR PORTA \n 2 - ABRIR PORTA \n 3 - ALTERAR DIMENSÕES \n 4 - VERIFICAR ESTADO");
		estado=ler.nextInt();
		switch(estado) {
		case 0: 
			System.out.println("Programa fechado");
			break;
		case 1:
			porta.fecharPorta();
			break;
		case 2:
			porta.abrirPorta();
			break;
		case 4:
			porta.verificarEstado(porta.getVerificarEstado());
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
		
	}while(estado!=0);
}
}
