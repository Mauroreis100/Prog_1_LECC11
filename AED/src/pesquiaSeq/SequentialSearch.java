package pesquiaSeq;

public class SequentialSearch {
	
	public static void main(String [] args) {
		System.out.println(buscaSequencial(null, 0));
	}
	
	public static int buscaSequencial (int array[], int valor) {
		for(int i = 0; i< array.length; i++) {
			if(array[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	

}
	
