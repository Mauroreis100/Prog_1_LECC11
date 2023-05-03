import java.util.*;
public class ex13{
	public static Scanner ler=new Scanner(System.in);
	public static int total=0;
	public static void main(String[] args){
		ArrayList<Integer>votos=new ArrayList<>();
		ArrayList<String>sistema=new ArrayList<>();
		sistema.add("Windows Server");
		sistema.add("Unix");
		sistema.add("Linux");
		sistema.add("Netware");
		sistema.add("Mac OS");
		sistema.add("Outro");
		
		System.out.println("Qual e o melhor sistema operativo: ");
		System.out.println("1- Windows Server");
		System.out.println("2- Unix");
		System.out.println("3- Linux");
		System.out.println("4- Netware");
		System.out.println("5- Mac OS");
		System.out.println("6- Outro");
		int escolha=ler.nextInt();
		int parar=0,windows=0,unix=0,linux=0,netware=0,mac=0,outro=0;
		while(parar==0){
			switch(escolha){
				case 1: 
					windows=windows+1;
					break;
				case 2: 
					unix=unix+1;
					break;
				case 3:
					linux=linux+1;
					break;
				case 4:
					netware=netware+1;
					break;
				case 5:
					mac=mac+1;
					break;
				case 6: 
					outro=outro+1;
					break;
				default: System.out.println("Opcao invalida");
			}
			System.out.println("Se deseja votar novamente digite 0: ");
			parar=ler.nextInt();
			if(parar==0){
				System.out.println("Qual e o melhor sistema operativo: ");
				System.out.println("1- Windows Server");
				System.out.println("2- Unix");
				System.out.println("3- Linux");
				System.out.println("4- Netware");
				System.out.println("5- Mac OS");
				System.out.println("6- Outro");
				escolha=ler.nextInt();
			}
		}
		votos.add(windows);
		votos.add(unix);
		votos.add(linux);
		votos.add(netware);
		votos.add(mac);
		votos.add(outro);
		
		total=windows+unix+linux+netware+mac+outro;
		mostrarPercentagem(total,votos,sistema);
		
	}
	public static void mostrarPercentagem(int total, ArrayList<Integer>votos,ArrayList<String>sistema){
		ArrayList<Double>percentagemVotos=new ArrayList<>();
		double percV=0;
		for(int i=0;i<votos.size();i++){
			percV=(votos.get(i)/total);
			percentagemVotos.add(percV);
		}
		System.out.println("Sistema Operativo            Votos       %");
		System.out.println("-------------------           -----     ---");
		for(int i=0;i<6;i++){
		System.out.println(sistema.get(i)+" "+votos.get(i)+"  "+percentagemVotos.get(i));
		
		
			
		//System.out.println(sistema.get(1)+"      "+votos.get(1)+"  "+percentagemVotos.get(1));
		//System.out.println(sistema.get(2)+"      "+votos.get(2)+"  "+percentagemVotos.get(2));
		//System.out.println(sistema.get(3)+"      "+votos.get(3)+"  "+percentagemVotos.get(3));
		//System.out.println(sistema.get(4)+"      "+votos.get(4)+"  "+percentagemVotos.get(4));
		//System.out.println(sistema.get(5)+"      "+votos.get(5)+"  "+percentagemVotos.get(5));
		}
	}
}