/*Ex12
Numa empresa existem n empregados cujos salários variam entre 25 000 mtn e 200 000. Execute um programa que relata quantos funcionários ganham menos de 50 000 mtn e quantos
mais de 50 000 mtn. Informe também o total que a empresa gasta com o pagamento de salários de seus funcionários.
*/
import java.util.Scanner;
public class NrSalarios{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int nT, n1=0, n2=0, i=1;
	double sal1=0, sal2=0, salGasto=0, sal;
	
	System.out.println("Quantos funcionarios tem a empresa?");
	nT=ler.nextInt();
	System.out.println("Insira o salario dos funcionarios");
		do{
			sal=ler.nextDouble();
				if(sal<50000){
					sal1++;
					
				}else{
				sal2++;		
				}
			
			i++;	//irá incrementar depois de perguntar sobre o primeiro funcionário
		}while(i<nT);
		salGasto=sal1+sal2;
			System.out.print("Na empresa com "+nT+" funcionarios, "+sal1+" recebem menos de 50 000 e "+sal2+" recebem mais de 50 000");
	
	
	
	}
}