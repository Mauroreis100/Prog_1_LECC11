package classcast;

import java.util.Scanner;

public class Castando {
	String carro;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		//ClassCastException
//		Object objecto = new Integer(0);
//		System.out.println((String)objecto); 
		
		//IllegalArgumentException  
//		ilegal("3.4");
		
		
		//NullPointerException
//		String frase[]={"fr","ra",null};
//		System.out.println(frase[2].toCharArray());
		
		
		//NumberFormatException
//		System.out.println("Enter any invalid Integer:\n"
//				+ "12,017\n"
//				+ "NumberFormatException occurred\n"
//				+ "Enter any valid Integer:\n"
//				+ "Sixty4\n"
//				+ "NumberFormatException occurred\n"
//				+ "Enter any valid Integer:\n"
//				+ "null\n"
//				+ "NumberFormatException occurred\n"
//				+ "Enter any valid Integer:\n"
//				+ "436.25\n"
//				+ "NumberFormatException occurred\n"
//				+ "Enter any valid Integer:\n"
//				+ "3.o\n"
//				+ "NumberFormatException occurred\n"
//				+ "Enter any valid Integer:\n"
//				+ "98562341789 ");
//		  int number = Integer.parseInt(sc.next());	
//		System.out.println(number);
		
		//NegativeArraySizeException
//		int numeros[]= new int[-4];
//		System.out.println(numeros[-4]);
	}
	public static void ilegal(double a) {
		
	}
}
