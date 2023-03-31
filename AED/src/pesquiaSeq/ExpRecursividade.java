package pesquiaSeq;

public class ExpRecursividade {
	
	public static void main(String[] args) {
		System.out.println(exp(0,3));
	}
	
	public static int exp(int n, int m) {
		if(m == 0) {
			return 1;
		}
		
		return exp(n,m-1)*n;
	}
	
	
	/*
	 * Diferenca pesq binaria e seq
	 * 
	 * Na pesq sequencial faz a comparacao de igualdade(comparacao de cada elemento com o nr por
	 * procurar) natureza exponencia;
	 * Na pesq binaria nao se faz: comparacao de ordenamento
	 * 
	 * dividir grupo de dados em 2 e comparamos o elemento que esta no meio 
	 * é maior ou menor que a parte procura...se for maior ignora-se os nrs que estao a direita*/
	
	/*VAntagens de recursividdade
	 * maior clareza do algoritmo para problemas de definicao naturalmente recursiva 
	 * reduz-se o tamanho do codigo
	 * 
	 * Desvantagens
	 * 
	 * Dificuldade de perceber o erro, visto que a resolucao comeca do final para o inicio
	 * stack overflow pode ocorrer devido a espaco limitado da memoria ou
	 * quando os parametros nao variam ou estao mal definidos
		
	*/
}
