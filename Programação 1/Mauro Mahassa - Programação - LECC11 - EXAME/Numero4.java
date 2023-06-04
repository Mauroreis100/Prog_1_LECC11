
import java.util.Scanner;
import java.util.ArrayList;
public class Numero4{
	public static void main(String args[]){
	Scanner ler=new Scanner(System.in);	
	ArrayList<Double> numeros=new ArrayList<>();
	int opcao=-1;
//double teste=ler.nextDouble();
//numeros.add(teste);
//System.out.println(numeros);
	do{
		System.out.println("1 - ADICIONAR UM NÚMERO\n2 - PESQUISAR UM NÚMERO\n3 - MODIFICAR UM NÚMERO\n4 - DELETAR UM NÚMERO\n\5 - INSERIR NUMA DETERMINADA POSIÇÃO\n0 - PARA ENCERRAR O PROGRAMA\n-->");
		opcao=ler.nextInt();
		switch(opcao-1){
			case 0:
				System.out.println("Digite o número que pretende adicionar no Array\n-->");
				double numero=ler.nextDouble();
				numeros.add(numero);
System.out.println("Número adicionado");
			break;
			case 1:
				System.out.println("Digite o número que pretende pesquisar no Array\n-->");
				double procurado=ler.nextDouble();
				int posicao=0;
				boolean encontra;
				int encontrar=numeros.indexOf(procurado);
if(encontrar!=-1){
				System.out.println("O número "+procurado+" está na posição"+encontrar);
}else{
System.out.println("Número não encontrado");
}
break;
				case 2:
				System.out.println("Digite o número que pretende modificar no Array\n-->");
				System.out.println(numeros);
				double procuradoo=ler.nextDouble();
				int posicaoo=0;
				int encontrarr=numeros.indexOf(procuradoo);
			if(encontrarr!=-1){
				System.out.println("Número novo");
				double mudar=ler.nextDouble();
				numeros.set(encontrarr,mudar);
			}else{
		System.out.println("Número não encontrado");
				}
					break;


case 3:
				System.out.println("Digite o número que pretende remover no Array\n-->");
				System.out.println(numeros);
				double procuradooo=ler.nextDouble();
				int posicaooo=0;
				int encontrarrr=numeros.indexOf(procuradooo);
			if(encontrarrr!=-1){
				numeros.remove(procuradooo);
			}else{
		System.out.println("Número não encontrado");
				}
					break;


case 4:

System.out.println("Digite o número que pretende modificar no Array\n-->");
				System.out.println(numeros);
				double procuradoooo=ler.nextDouble();
				int posicaoooo=0;
				int encontrarrrr=numeros.indexOf(procuradoooo);
			if(encontrarrrr!=-1){
				System.out.println("Número novo");
				double mudarr=ler.nextDouble();
				numeros.set(encontrarrrr,mudarr);
			}else{
		System.out.println("Número não encontrado");
				}

break;


			default:
				System.out.println("Opção Inválida");
			break;
			}
	}while(opcao!=0);
System.out.print(numeros);
}
}
