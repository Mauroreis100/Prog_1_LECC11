package selectionSort;

public class SelectionSort {
	public static void main(String[] args) {
		int numbers[] = {5,6,3,1,8,7,2,4};
		System.out.println("Before");
		printArray(numbers);
		
		selectionSort(numbers);
		
		System.out.println("\nAfter");
		printArray(numbers);
		
	}

	private static void selectionSort(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i = 0; i < numbers.length - 1; i++) {
			int min = i;
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[min] > numbers [j]) {
					min = j;
				}
			}
			//troca
			int temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;	
		}
	}
	
	
	private static void printArray(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(+array[i]+" "); 
			
		}
	}
}
