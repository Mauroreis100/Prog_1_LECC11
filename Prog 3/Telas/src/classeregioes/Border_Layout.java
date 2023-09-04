package classeregioes;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Border_Layout {
	private JFrame jf;
	//PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO
	
	//Criando um botão:
	private JButton bt_north;
	private JButton bt_west;
	private JButton bt_east;
	private JButton bt_center;
	private JButton bt_south;
	
	public Border_Layout() {
		jf = new JFrame();//PARA QUALQUER JANELA DEVE COMEÇAR COM ISTO
		//Inicializações de variáveis: 
		bt_north = new JButton("NORTH");//Inicializei o componente dentro do construtor
		bt_west = new JButton("WEST"); //Inicializei o componente dentro do construtor
		bt_east = new JButton("EAST");//Inicializei o componente dentro do construtor
		bt_center = new JButton("CENTER");//Inicializei o componente dentro do construtor
		bt_south = new JButton("SOUTH");//Texto da label
	
		//Inicializar componentes
		jf.setTitle("Border_Layout.exe");//O tittulo da janela.
		jf.setSize(500,500);//Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100,100);//Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);//Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Quando o utilizador clicar no x. Mata todos os frames
		jf.setLayout(new BorderLayout(BorderLayout.CENTER));
		//jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		//jf.setLayout(new FlowLayout(align,altura,espaco entre eles));
		
//jf.setLayout(new FlowLayout(FlowLayout.RIGHT));
		/*O FlowLayout recebe um parametro de alinhamento da esquenda para a direita, por definião 
		Se quero que comece do centro para a esquerda uso jf.setLayout(new FlowLayout(FlowLayout.CENTER));
		, Ou da direita para esquerda coloco FlorLatyout..RIGHT. 
		O FlowLayout ajusta os componentes de acordo com o tamanho da tela
		*/
		
		
		
		//Adicionar Botões
		jf.add();
		jf.add();
		jf.add();//Adicionar o botão na tela
		
		/*jf.add(bt_submeter, BorderLayout.EAST);//Adicionar o botão na telajf.add(lb_introduza, BorderLayout.WEST);jf.add(tf_campoInicial, BorderLayout.SOUTH);*/
		
		jf.setVisible(true);//Se não colocar a tela ñ aparece. É a ultima instrução no programa
		/*Saber para que Hardware estamos a fazer*/
	}
}
