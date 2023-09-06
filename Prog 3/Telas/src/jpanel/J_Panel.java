package jpanel;
import java.awt.*;
import javax.swing.*;


public class J_Panel {
	private JFrame jf;
	// PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO
	private JPanel jp_buttons;
	
	private JPanel jp_menus;

	// Criando um botão:
	private JButton bt_north;
	private JButton bt_west;
	private JButton bt_east;
	private JButton bt_center;
	private JButton bt_south;
	private JButton bt_1;
	private JButton bt_2;
	private JButton bt_3;
	private JLabel lb_menu1;
	private JLabel lb_menu2;
	private JLabel lb_menu3;
	private JTextField tf_Texto;

	public J_Panel() {
		jf = new JFrame();// PARA QUALQUER JANELA DEVE COMEÇAR COM ISTO
		jp_buttons = new JPanel();
		jp_menus=new JPanel();
		// Inicializações de variáveis:
		bt_north = new JButton("NORTH");// Inicializei o componente dentro do construtor
		bt_west = new JButton("WEST"); // Inicializei o componente dentro do construtor
		bt_east = new JButton("EAST");// Inicializei o componente dentro do construtor
		bt_center = new JButton("CENTER");// Inicializei o componente dentro do construtor
		bt_south = new JButton("SOUTH");// Inicializei o componente dentro do construtor
		
		lb_menu1 = new JLabel("Menu 1");// Inicializei o componente dentro do construtor
		lb_menu2 = new JLabel("Menu 2");// Inicializei o componente dentro do construtor
		lb_menu3= new JLabel("Menu 3");// Inicializei o componente dentro do construtor
		
		bt_1 = new JButton("1");// Inicializei o componente dentro do construtor
		bt_2 = new JButton("2");// Inicializei o componente dentro do construtor
		bt_3= new JButton("3");// Inicializei o componente dentro do construtor
		
		tf_Texto=new JTextField("");
		
		// Inicializar componentes
		jf.setTitle("Border_Layout.exe");// O tittulo da janela.
		jf.setSize(500, 500);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		jf.setLayout(new BorderLayout(20,20));
		jp_buttons.setLayout(new GridLayout(3,1,20,20));
		jp_menus.setLayout(new GridLayout(3,1,20,20));
		// Adicionar Botões
		
		jp_buttons.add(bt_1);
		jp_buttons.add(bt_2);
		jp_buttons.add(bt_3);
		
		jp_menus.add(lb_menu1);
		jp_menus.add(lb_menu2);
		jp_menus.add(lb_menu3);
		
		
		
		jf.add(BorderLayout.NORTH, bt_north);// O border Layout me diz a posição do botão (nome do componente, Posição/regia)
		jf.add(BorderLayout.WEST,jp_buttons);
		jf.add(bt_center, BorderLayout.CENTER);
		jf.add(jp_menus, BorderLayout.EAST);
		jf.add(tf_Texto, BorderLayout.SOUTH);

		jf.setVisible(true);
	}
}
