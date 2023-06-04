package buffer_token;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 
import java.util.StringTokenizer;

public class PalavraCapitalizada {
public static void main(String[] args) {
	Scanner nome=new Scanner(System.in);
	System.out.println("Qual é o nome do ficheiro que pretende ler?");
	try {
	      File myObj = new File("M:\\Prog_1_LECC11\\workspace-Mauro\\buffer_token\\src\\frases\\"+nome.next()+".txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(capitalizar(data));
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Não foi possível encontrar o ficheiro");
	      e.printStackTrace();
	    }
	

	
}
public static String capitalizar(String palavra) {
	 StringBuffer d=new StringBuffer(" "+palavra);
	//d.replace(0, 10, "A");
	//char a[]={'a'};
	//d.insert(0, d.setCharAt(0, 0)));

	//d.deleteCharAt(0);
	//d.insert(0,"O".toLowerCase());
	
	for(int i=0;i<d.length();i++) {
		
		if(d.charAt(i)==' ' ) {
			String letra=""+d.charAt(i+1);
			d.deleteCharAt(i+1);
			d.insert(i+1,letra.toUpperCase());
		}
		}
	d.deleteCharAt(0);
	/*
	 StringTokenizer d = new StringTokenizer(palavra);
	
     while (d.hasMoreTokens()) {
        StringBuffer p=new StringBuffer(d.nextToken());
        p.insert(0, "d");
     }}*/
	 
	return ""+d.toString();
}
}
