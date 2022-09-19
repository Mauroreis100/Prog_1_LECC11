package soma7impares;

public class Soma7impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int some=0,j=1;
				for (int i=0; i<=20; i++) {
					if(i%2!=0) {
						if(j<=7) {
							some+=+i;
						}
			j++;
						
						
					}
					
					
				}
				System.out.println(some+" ");
		

	}

}
