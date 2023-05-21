package ex1;
import javax.swing.JOptionPane;
import java.util.Vector;

public class OperacaoImplement implements Operacoes {

	@Override
	public boolean inserirVeiculo(Vector lista, Veiculo veiculo) {
		// TODO Auto-generated method stub
		if(lista.size() > 30 ) {
			return false;
		} else {
			lista.addElement(veiculo);
			return true;
		}
	}

	@Override
	public void listar(Vector lista) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Listagem de todos os veículos!!"+"LIST"+JOptionPane.WARNING_MESSAGE);
		for(int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null,lista.get(i));
			//System.out.print(lista.get(i)+" ");
		}
	}

	@Override
	public Veiculo procurarMatricula(Vector lista, String matricula) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < lista.size(); i++) {
			if(  (((Veiculo)lista.get(i)).getMatricula()).equalsIgnoreCase(matricula) ) {
				
				return ((Veiculo)lista.get(i));
			}
		}
		return null;
	}

	
	
	@Override
	//liistar por marca
	public void listarPorMarca(Vector lista, String marca) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"LISTAGEM POR DE veiculo da marca"+marca);
		for(int i = 0 ; i < lista.size(); i++) {
			
			if((((Veiculo)lista.get(i)).getMarca()).equalsIgnoreCase(marca)) {
				JOptionPane.showMessageDialog(null,(Veiculo)lista.get(i));
				//System.out.println((Veiculo)lista.get(i));	
			}
		}
		
	}

	
	@Override
	public void listarMais(Vector lista) {
		// TODO Auto-generated method stub
		long maiorVinteQuatro = 0;
		JOptionPane.showMessageDialog(null,"Lista de veículos acima de 24 horas:");
		//System.out.println("Lista de veículos acima de 24 horas: ");
		for(int i = 0; i < lista.size(); i++) {
			
			maiorVinteQuatro = 0;
			maiorVinteQuatro = (((((Veiculo)lista.get(i)).getDataSaida()).getTimeInMillis()) - ((((Veiculo)lista.get(i)).getDataEntrada()).getTimeInMillis()));
			//System.out.println(maiorVinteQuatro);
			if(maiorVinteQuatro > 86400000) {
				JOptionPane.showMessageDialog(null, ((Veiculo)lista.get(i)));
				//System.out.print( ((Veiculo)lista.get(i)) );
			}	
		}
	}
}
