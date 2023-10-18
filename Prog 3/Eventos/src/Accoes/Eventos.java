package Accoes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Eventos extends JFrame implements ActionListener{

	private JLabel lb_nome;
	private TextField tf_nome;
	private JButton bt_submeter;

	Eventos() {

		lb_nome = new JLabel("Nome");
		tf_nome = new TextField(25);
		bt_submeter = new JButton("Submeter");

		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Linguagem de Programação II");// O tittulo da janela.
		this.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		
		// Eventos -----------------
		bt_submeter.addActionListener(this);
		// Eventos -----------------

		this.setLayout(new FlowLayout(1, 2, 2));
		this.add(lb_nome);
		this.add(tf_nome);
		this.add(bt_submeter);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt_submeter) {
			JOptionPane.showMessageDialog(null, tf_nome.getText());
		}
	}

}
