import java.util.*;
public class e11{
	public static Scanner ler=new Scanner(System.in);
	public static void main(String[] args){
		ArrayList<String>atleta=new ArrayList<String>();
		ArrayList<Double>salto=new ArrayList<>();
		ArrayList<Double> media=new ArrayList<>();
		
		System.out.println("Insira a quantidade de atletas:  ");
		int n=ler.nextInt();
		String para=null;
		double soma=0;
		double media1=0;
		while(para!=" "){
			for(int i=0;i<3;i++){
				System.out.println("Insira cinco saltos:  ");
				salto.add(ler.nextDouble());
				
			}
				for(int j=0;j<3;j++){
					soma+=salto.get(j);
				}
				media1=soma/5;
				media.add(media1);
			System.out.println("Se deseja parar insira espaco");		
			para=ler.next();
		if(para.equals(" ")){
			System.out.println("Insira o nome do atleta: ");
		
			atleta.add(ler.next());	
		}
		
		}
		System.out.println(" ");
		for(int i=0;i<atleta.size();i++){
			System.out.println("Atleta "+atleta.get(i));
			System.out.println("Tem saltos: ");
			for(int j=0;j<5;j++){
				System.out.println(salto.get(j)+" ");
				for(int k=0;k<media.size();k++){
					System.out.println("media= "+media.get(k));
				}
			}
		}
	
		
	}

}