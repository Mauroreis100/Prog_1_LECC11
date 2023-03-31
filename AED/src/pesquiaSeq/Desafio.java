package pesquiaSeq;
import java.util.ArrayList;
public class Desafio {
	public static void main(String[] args) {
		ArrayList<Integer> Lista = new ArrayList<>();
		Lista.add(2);
		Lista.add(4);
		Lista.add(6);
		Lista.add(8);
		Lista.add(3);
		int indice = 0;
		System.out.println(acharProd(Lista, 3,indice));
	}
	
	public static int acharProd(ArrayList<Integer> Lista, int valor,int indice){
		
		
		 if (indice >= Lista.size()) {
	            return -1;
	        }
	        
	        
	        if (Lista.get(indice) == valor) {
	            return indice;
	        }
	        
	        
	        return acharProd(Lista, valor, indice + 1);
	    }

}
/*
 * import java.util.ArrayList;
	public class prodVectores{ 
	public static void main(String[] args){
		ArrayList<Integer> Lista=new ArrayList<>();
		Lista.add(2);
		Lista.add(4);
		Lista.add(6);
		Lista.add(8);
		Lista.add(10);
		int tamanho= Lista.size();

		System.out.println("A produto da lista com elementos "+Lista+" ="+acharProd(Lista,tamanho));
	}
	
	public static int acharProd(ArrayList<Integer> Lista, int tamanho){
		int prod=1;
		if(tamanho!=0){
			return Lista.get(tamanho-1)*acharProd(Lista,tamanho-1);
		}else{
			return 1;
		}
	}
}
 * */