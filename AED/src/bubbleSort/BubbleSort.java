package bubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
		int numbers[] = {5,6,3,1,8,7,2,4};
		//int numbers[] = {4,3,1,2};
		
		System.out.println("Before: ");
		printArray(numbers);
		
		boolean swappedSomething = true;
		int temp = 0;
		
		while(swappedSomething) {
		
			for(int i = 0; i < numbers.length - 1; i++) { //quando se compara aos pares lim de i e tamanho - 1;
				
				
				if(numbers[i] > numbers[i+1]) {
					
					temp = numbers[i];				
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				}
			}
			
			swappedSomething = checkOrder(numbers);
		}
		
		System.out.println("\nAfter");
		printArray(numbers);	
		
	}
	
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	private static boolean checkOrder(int[] array) {
		int j = 0;
		for(int i = 0; i < array.length - 1; i++) {
			
			if(array[i] > array[i+1]) {
				j++;
			}
		}
		
		if(j!= 0) {
			return true;
		}
		
		j=0;
		return false;
		
	}
}	
	