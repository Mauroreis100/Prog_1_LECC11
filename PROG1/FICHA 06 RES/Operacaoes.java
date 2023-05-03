/*
S1= 1/1 + 3/2 + 5/3 + 7/4 +...+ 99/50;

S2= (2^(1))/50 + (2^(2))/49 + (2^(3))/48 +...+ (2^(50))/1;

S3= 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - ... -10/100;

*/
public class Operacaoes{
	public static void main(String[] args){
	int j,i;
	s1();
	}
	
	public static void s1 ( ){
		double s1=0;
		for (int i = 1;i<=50;i++){
			//s1= 2*i-1/i;...tentar com 2 for
			s1+=(2*i-1)/i;
	
		}
		System.out.println(s1);
	}
	
	
}