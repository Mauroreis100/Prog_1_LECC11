package merge;

public class mergesort {
	public static void main(String[] args) {
		
		int [] array = {3,1,4,1,5,9,2,6,5,4};
		
		System.out.println("Before:");
		printArray(array);
		
		mergeSort(array);
		
		System.out.println("\nAfter:");
		printArray(array);
	}
	private static void mergeSort(int[] inputArray) {
		// Variavel que recebe o tamanho do array
		int inputLength = inputArray.length;
		
		if(inputLength < 2) {
      /*  condicao de paragem. Em outras 
      palavras significa que o array tem apenas
       um elemento ou nenhum
      */return;
		}
		// caso nao se verifique isto temos que dividir o 
    //array na metade e o mesmo com as metades
		//para fazer isso precisamos obter da metade do array, 
    //que seria a metade do tamanho do array
		
		int midIndex = inputLength/2; 
    /*com este valor vamos criar 
    left and right array*/
		int [] leftHalf = new int[midIndex];
    //permite pegar todos elemento, para casos impares
		int [] righttHalf = new int[inputLength - midIndex ];
		//criamos os arrays, mas falta colocar os elementos: 
		
    //quer se preencher leftHalf entao o limite do loop sera a metade
		for(int i = 0; i < midIndex; i++) {
      
			leftHalf[i] =inputArray[i];
		}
		//quer se preencher leftHalf entao o limite do loop sera a metade
		for(int i = midIndex; i < inputLength; i++) {
      //i-midIndex para poder pegar 0 do subarray
			righttHalf[i - midIndex] =inputArray[i];}
		mergeSort(leftHalf); 
		mergeSort(righttHalf);
		merge(inputArray, leftHalf, righttHalf);
		
	}
	
	
private static void merge (int[] inputArray, int [] leftHalf, int [] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		// i para esquerda, j para direita e k para o array fundido
	
		int i = 0, j = 0, k = 0;
		
		while (i < leftSize && j < rightSize) {
			//comparar o i-nesimo elemento do array da esquerda com 
      //o j-esimo elemento do array
			if(leftHalf[i] <= rightHalf[j]) {//se o elemento a esquerda
				inputArray[k] = leftHalf[i];
				i++;//para passar pra outro elemento
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
      //depois de adicionar o elemento do array da fusao,
      // iteracao do input
			
			/*Depois de comparar temos o caso em que podemos 
      nao esgotar elementos em um dos subarrays
			 * para garantir que os restantes sejam 
       * adicionados no array, vamos fazer essa instrucao: */
		}	
			while(i < leftSize) {
				inputArray[k] = leftHalf[i];
				i++;
				k++;
			}
			
			while(j < leftSize) {
				inputArray[k] = rightHalf[j];
				j++;
				k++;
			}
			
	}
	

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
}