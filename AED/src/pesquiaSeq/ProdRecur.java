package pesquiaSeq;

public class ProdRecur {
	public static void main(String[] args) {
	
		System.out.println(prod(3,2));
	}
	
	public static int prod(int m, int n) {
		
		if(m == 0) {
			return 0;
		}
		
		return prod(m-1,n+n)+m;
	}
	
	/*
	 * Problemas de natureza recursiva sao aqueles que sao descritos em factores de si proprio
	 * 
	 * */
}
