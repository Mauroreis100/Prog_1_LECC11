package Accoes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Eventos implements ActionListener {
	private JFrame jf;
	private JLabel lb_nome;
	private TextField tf_nome;
	private JButton bt_submeter;

	Eventos() {
		jf = new JFrame();
		lb_nome = new JLabel("Nome");
		tf_nome = new TextField(25);
		bt_submeter = new JButton("Submeter");

		// ---------------------------------------------------------------------------------------------------------------
		jf.setTitle("Linguagem de Programação II");// O tittulo da janela.
		jf.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		
		// Eventos -----------------
		bt_submeter.addActionListener(this);
		// Eventos -----------------

		jf.setLayout(new FlowLayout(1, 2, 2));
		jf.add(lb_nome);
		jf.add(tf_nome);
		jf.add(bt_submeter);
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt_submeter) {
			JOptionPane.showMessageDialog(null, tf_nome.getText());
		}
	}

}
