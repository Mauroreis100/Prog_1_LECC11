import java.util.*;
public class ex7{
	
	public static void main(String[] args){
		ArrayList <Integer>dados1=new ArrayList<>();
		ArrayList <Double>dados2=new ArrayList<>();
		ArrayList <String>dados3=new ArrayList<>();
		ArrayList <Character>dados4=new ArrayList<>();
		ArrayList <Boolean>dados5=new ArrayList<>();
		
		dados1.add(1);
		dados1.add(2);
		dados1.add(3);
		dados1.add(4);
		dados1.add(5);
		dados1.add(6);
		dados1.add(7);
		dados1.add(8);
		dados1.add(9);
		dados1.add(10);
		
		dados2.add(0.01);
		dados2.add(0.2);
		dados2.add(3.3);
		dados2.add(4.3);
		dados2.add(5.9);
		dados2.add(5.0);
		dados2.add(10.56);
		dados2.add(22.3);
		dados2.add(43.999);
		dados2.add(5.1);
		
		dados3.add("a");
		dados3.add("e");
		dados3.add("i");
		dados3.add("o");
		dados3.add("u");
		dados3.add("1");
		dados3.add("2r");
		dados3.add("3s");
		dados3.add("5");
		dados3.add("1");
		
		dados4.add('a');
		dados4.add('b');
		dados4.add('c');
		dados4.add('d');
		dados4.add('e');
		dados4.add('f');
		dados4.add('g');
		dados4.add('h');
		dados4.add('i');
		dados4.add('j');
		
		dados5.add(true);
		dados5.add(true);
		dados5.add(true);
		dados5.add(false);
		dados5.add(true);
		dados5.add(true);
		dados5.add(false);
		dados5.add(true);
		dados5.add(true);
		dados5.add(false);
		
		System.out.println("Impressao dos valores cadastrados: ");
		System.out.println("Inteiro: "+dados1);
		System.out.println("Real: "+dados2);
		System.out.println("String: "+dados3);
		System.out.println("Character: "+dados4);
		System.out.println("Boolean ou logico: "+dados5);
	}
}