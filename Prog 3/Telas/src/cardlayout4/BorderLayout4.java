package cardlayout4;
import java.awt.*;
import javax.swing.*;

public class BorderLayout4 {
	private JFrame jf;
	// PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO
	
	private JPanel jp_menus;

// Criando um botão:
	private JButton bt_1;
	private JButton bt_2;
	private JButton bt_3;
	private JButton bt_4;
	private JTextField tf_tf;
//	private JLabel lb_menu2;
//	private JLabel lb_menu3;
//	private JTextField tf_Texto;
	public BorderLayout4() {
		jf = new JFrame();// PARA QUALQUER JANELA DEVE COMEÇAR COM ISTO

		jp_menus=new JPanel();
		// Inicializações de variáveis:
		bt_1 = new JButton("BUTTON 1");// Inicializei o componente dentro do construtor
		bt_3 = new JButton("BUTTON 3"); // Inicializei o componente dentro do construtor
		bt_4 = new JButton("BUTTON 4");// Inicializei o componente dentro do construtor
		tf_tf = new JTextField("");// Inicializei o componente dentro do construtor
		bt_2 = new JButton("BUTTON 2");// Inicializei o componente dentro do construtor
		
		// Inicializar componentes
		jf.setTitle("Border_Layout1.exe");// O tittulo da janela.
		jf.setSize(500, 500);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		jf.setLayout(new BorderLayout());
//		jp_buttons.setLayout(new GridLayout(3,1));
		jp_menus.setLayout(new GridLayout(10,1,20,20));
// 		Adicionar Botões
		
		jp_menus.add(tf_tf);

		jf.add(BorderLayout.NORTH, bt_1);// O border Layout me diz a posição do botão (nome do componente, Posição/regia)
		jf.add(BorderLayout.WEST,bt_3);
		jf.add(jp_menus, BorderLayout.CENTER);
		jf.add(bt_4, BorderLayout.EAST);
		jf.add(bt_2, BorderLayout.SOUTH);

		jf.setVisible(true);
	}
}
