package baglayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBag {
	private JFrame jf;
	private JButton bt_S;
	private JButton bt_1;
	private JButton bt_2;
	private JButton bt_3;
	private JButton bt_4;
	private JButton bt_5;
	private JButton bt_6;
	private JButton bt_7;
	private JButton bt_8;
	private JButton bt_9;
	private JButton bt_10;
	private JButton bt_11;
	private JButton bt_12;

	public GridBag() {
		jf.setTitle("12 Botões");// Nome da tela
		jf.setSize(370, 140);// Tamanho da tela
		jf.setLocation(100, 100);// Onde arrancar
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setLayout(new GridLayout(3, 5, 10, 10));// Linhas x Colunas
		jf.setResizable(false);// Pode resuze or not
		// jf.setLayout(new BorderLayoutFrame());
		// jf.setLayout(new FlowLayout());//

		// Adicionando botões ao Frame
		/*
		 * jf.add(bt_2); jf.add(bt_3); jf.add(bt_4); jf.add(bt_5); jf.add(bt_6);
		 * jf.add(bt_7); jf.add(bt_8); jf.add(bt_9); jf.add(bt_10); jf.add(bt_11);
		 * jf.add(bt_12);
		 */

		// TUDO VISÍVEL
		jf.setVisible(true);
	}
}
