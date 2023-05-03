import java.util.*;
public class ex12{
	public static Scanner ler=new Scanner(System.in);
	public static int contRespP=0,contRespN=0,respostaPositiva=0;
	
	public static void main(String[] args){
		ArrayList<String>pergunta=new ArrayList<>();
		pergunta.add("Telefonou para a vitima?");
		pergunta.add("Esteve no local do crime?");
		pergunta.add("Mora perto da vitima?");
		pergunta.add("Devia para a vitima?");
		pergunta.add("Ja trabalhou com a vitima?");
		
		System.out.println("Responda as seguintes perguntas: ");
		System.out.println("");
		determinador(pergunta);
		julgamento(respostaPositiva);
	}
	
	public static void determinador (ArrayList<String>pergunta){
		String resp1="Sim",resp2="Nao",respUsuario;
		for(int i=0;i<pergunta.size();i++){
			System.out.println(pergunta.get(i));
			respUsuario=ler.next();
			
			if(respUsuario.equalsIgnoreCase(resp1)){
				contRespP=contRespP+1;
			}else{
				if(respUsuario.equalsIgnoreCase(resp2)){
				contRespN=contRespN+1;
				}
			}
			respostaPositiva=contRespP;
		}
		
		System.out.println("A quantidade de respostas positivas e: "+contRespP);
		System.out.println("A quantidade de respostas negativas e: "+contRespN);
		System.out.println("");
	}
	
	public static void julgamento(int respostaPositiva){
		System.out.println("O individou foi classificado como ");
		if(respostaPositiva==2){
			System.out.println("Suspeito");
		} else if(respostaPositiva>=3 && respostaPositiva<=4){
				System.out.println("Cumplice");
			}else if(respostaPositiva==4){
					System.out.println("Assassino");
				}else{
					System.out.println("Inocente");
				}
	}
}