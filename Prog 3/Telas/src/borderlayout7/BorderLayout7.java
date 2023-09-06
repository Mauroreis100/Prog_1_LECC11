package borderlayout7;

import java.awt.*;
import javax.swing.*;

public class BorderLayout7 {
	private JFrame jf;

	// PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO
	
	private JPanel jp_menus;

// Criando um botão:
	private JButton bt_N1;
	private JButton bt_W1;
	private JButton bt_E1;
	private JButton bt_S1;
	private JButton bt_NW;
	private JButton bt_N;
	private JButton bt_NE;
	private JButton bt_W;
	private JButton bt_C;
	private JButton bt_E;
	private JButton bt_SW;
	private JButton bt_S;
	private JButton bt_SE;
	
//	private JLabel lb_menu2;
//	private JLabel lb_menu3;
//	private JTextField tf_Texto;
	public BorderLayout7() {
		jf = new JFrame();// PARA QUALQUER JANELA DEVE COMEÇAR COM ISTO

		jp_menus=new JPanel();
		// Inicializações de variáveis:
		bt_N1 = new JButton("North");// Inicializei o componente dentro do construtor
		bt_S1=new JButton("South");
		bt_W1 = new JButton("West"); // Inicializei o componente dentro do construtor
		bt_E1 = new JButton("East");// Inicializei o componente dentro do construtor
		bt_NW = new JButton("Northwest");// Inicializei o componente dentro do construtor
		bt_N = new JButton("North");// Inicializei o componente dentro do construtor
		bt_NE = new JButton("Northeast");// Inicializei o componente dentro do construtor
		bt_W = new JButton("West");// Inicializei o componente dentro do construtor
		bt_C = new JButton("Center");// Inicializei o componente dentro do construtor
		bt_E = new JButton("West");// Inicializei o componente dentro do construtor
		bt_SW = new JButton("Southwest");// Inicializei o componente dentro do construtor
		bt_S = new JButton("South");// Inicializei o componente dentro do construtor
		bt_SE = new JButton("Southeast");// Inicializei o componente dentro do construtor
		
		
		// Inicializar componentes
		jf.setTitle("Border_Layout1.exe");// O tittulo da janela.
		jf.setSize(500, 500);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		jf.setLayout(new BorderLayout());
//		jp_buttons.setLayout(new GridLayout(3,1));
		jp_menus.setLayout(new GridLayout(3,3,10,170));
		
// 		Adicionar no PAINEL
		jp_menus.add(bt_NW);
		jp_menus.add(bt_N);
		jp_menus.add(bt_NE);
		jp_menus.add(bt_W);
		jp_menus.add(bt_C);
		jp_menus.add(bt_E);
		jp_menus.add(bt_SW);
		jp_menus.add(bt_S);
		jp_menus.add(bt_SE);

		jf.add(BorderLayout.NORTH, bt_N1);// O border Layout me diz a posição do botão (nome do componente, Posição/regia)
		jf.add(BorderLayout.WEST,bt_W1);
		jf.add(jp_menus, BorderLayout.CENTER);
		jf.add(bt_E1, BorderLayout.EAST);
		jf.add(bt_S1, BorderLayout.SOUTH);

		jf.setVisible(true);
	}
}
