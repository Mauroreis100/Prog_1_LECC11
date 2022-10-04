//Ex 2 da ficha4, somar impares dentro do intervalo de 0 a 20

public class SomarImpares7{
	public static void main(String[] args){
		int soma=0, i=0, contimp=0;
		
			do{
				i++;
				
					if(i%2!=0){
						contimp++;
					soma+=i;	
					}	
			
			}while(contimp<7);
				System.out.println("A soma dos primeiros 7 nrs impares e " +soma);
	
	}
}

//nao pode ser menor igual a 7 se nao vai mprirmir uma posicao a mais, rambem porque i foi inicilializado a 0, caso contrario contimp<=