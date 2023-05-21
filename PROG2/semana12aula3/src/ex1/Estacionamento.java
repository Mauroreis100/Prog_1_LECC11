package ex1;
import java.util.*;
import javax.swing.JOptionPane;

public class Estacionamento {

	public static void main(String[] args) {
		
		Calendar datahoraActual = Calendar.getInstance();
        Calendar datahoraActual1 = Calendar.getInstance();
        Calendar datahoraActual2 = Calendar.getInstance();
        Calendar datahoraActual3 = Calendar.getInstance();
        Calendar datahoraActual4 = Calendar.getInstance();
        Calendar datahoraActual5 = Calendar.getInstance();
        Calendar datahoraActual6 = Calendar.getInstance();
        Calendar datahoraActual7 = Calendar.getInstance();
        Calendar hora = Calendar.getInstance();
        Calendar hora1 = Calendar.getInstance();
        Calendar hora2 = Calendar.getInstance();
        Calendar hora3 = Calendar.getInstance();
        Calendar hora4 = Calendar.getInstance();
        Calendar hora5 = Calendar.getInstance();
        Calendar hora6 = Calendar.getInstance();
        Calendar hora7 = Calendar.getInstance();
        
        OperacaoImplement op = new OperacaoImplement();
		Vector lista = new Vector();
        
		
		datahoraActual.set(2023, 10, 25, 10, 9);
		hora.set(2023, 10, 25, 10, 10);
		Veiculo veiculo = new Carro("Karim","Toyota","Ractis","ABK 514 MC","Rosa",datahoraActual, hora, (short) 4);
		
		//mais de 24
		datahoraActual1.set(2023, 12, 5, 12, 30);
		hora1.set(2023, 12, 6, 12, 38);
		Veiculo veiculo1 = new Carro("Shelton","Mazda","RX-7","ABC 923 MC","Preto",datahoraActual1, hora1, (short) 3);
		
		datahoraActual2.set(2023, 1, 21, 5, 0);
		hora2.set(2023, 1, 21, 5, 10);
		Veiculo veiculo2 = new Carro("Cássia","BMW","X5","ABC 899 MC", "Branco", datahoraActual2, hora2,(short)5);
		
		//mais de 24 horas
		datahoraActual3.set(2023, 12, 2, 10, 50);
		hora3.set(2023, 12, 3, 10, 59);
		Veiculo veiculo3 = new Carro("Inária","Audi","A5","AIS 221 MC","Preto", datahoraActual3,  hora3, (short)4);
		
		datahoraActual4.set(2023, 8, 16, 2, 20);
		hora4.set(2023, 8, 17, 2, 20);
		Veiculo veiculo4 = new Carro("Waine Sebasconha","BMW","X1", "BOO 555 MC","Rosa", datahoraActual4,  hora4, (short)5);
		
		datahoraActual5.set(2023, 12, 2, 10, 30);
		hora5.set(2023, 12, 2, 10, 30);
		Veiculo veiculo5 = new Carro("Adozinda","Toyota", "Rush","ABK 239 MC","Verde", datahoraActual5,  hora5, (short)5);
		
		datahoraActual6.set(2023,9,9,10,30);
		hora6.set(2023,9,9,10,30);
		Veiculo veiculo6 = new Mota("Shánia","Yamaha","Fluo","SMS 129 MC","preto", datahoraActual6,hora6);
		
		datahoraActual7.set(2023,9,30,10,30);
		hora7.set(2023,10,9,10,30);
		Veiculo veiculo7 = new Mota("Mujahid","BMW","F 850 GS","ART 112 MC","preto", datahoraActual7,hora7);
		
		op.inserirVeiculo(lista,veiculo);
		op.inserirVeiculo(lista, veiculo1);
		op.inserirVeiculo(lista, veiculo2);
		op.inserirVeiculo(lista, veiculo3);
		op.inserirVeiculo(lista, veiculo4);
		op.inserirVeiculo(lista, veiculo5);
		op.inserirVeiculo(lista, veiculo6);
		op.inserirVeiculo(lista, veiculo7);
	
		op.listarMais(lista);
		
		JOptionPane.showMessageDialog(null,"CHAMADA DE outro método"+JOptionPane.WARNING_MESSAGE);
		
		//op.listar(lista);
		
		//op.listarPorMarca(lista, "BMW");
		//op.listarPorMarca(lista, "Mazda");
		var procurar = "ABK 514 MC";
		
		var teste = op.procurarMatricula(lista, procurar);
		if(teste!=null) {
			JOptionPane.showMessageDialog(null, "Veículo da matrícula "+procurar+"\n "+teste);
		} else {
			JOptionPane.showMessageDialog(null,"Veiculo nao encontrado");
		}
		
	}
	
}
