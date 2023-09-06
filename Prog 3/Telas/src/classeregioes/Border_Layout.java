package classeregioes;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Border_Layout {
	private JFrame jf;
	// PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO

	// Criando um botão:
	private JButton bt_north;
	private JButton bt_west;
	private JButton bt_east;
	private JButton bt_center;
	private JButton bt_south;

	public Border_Layout() {
		jf = new JFrame();// PARA QUALQUER JANELA DEVE COMEÇAR COM ISTO
		// Inicializações de variáveis:
		bt_north = new JButton("NORTH");// Inicializei o componente dentro do construtor
		bt_west = new JButton("WEST"); // Inicializei o componente dentro do construtor
		bt_east = new JButton("EAST");// Inicializei o componente dentro do construtor
		bt_center = new JButton("CENTER");// Inicializei o componente dentro do construtor
		bt_south = new JButton("SOUTH");// Inicializei o componente dentro do construtor

		// Inicializar componentes
		jf.setTitle("Border_Layout.exe");// O tittulo da janela.
		jf.setSize(500, 500);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames

		// Adicionar Botões
		jf.add(BorderLayout.NORTH, bt_north);// O border Layout me diz a posição do botão (nome do componente,
												// Posição/regia)
		jf.add(bt_west, BorderLayout.WEST);
		jf.add(bt_center, BorderLayout.CENTER);
		jf.add(bt_east, BorderLayout.EAST);
		jf.add(bt_south, BorderLayout.SOUTH);

		jf.setVisible(true);
	}
}
