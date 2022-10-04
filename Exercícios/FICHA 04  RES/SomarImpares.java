//Ex 1 da ficha4, somar impares dentro do intervalo de 0 a 20

public class SomarImpares{
	public static void main(String[] args){
		int soma=0, i=0;
		
		while (i<20){
		i++;
			if(i%2!=0){
			soma+=i;//opcional e recomendável soma=soma+i	
			}	
		}	
	System.out.println(soma);
	}
}