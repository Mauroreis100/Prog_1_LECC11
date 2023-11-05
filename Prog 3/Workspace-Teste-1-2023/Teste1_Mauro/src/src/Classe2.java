package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;

public class Classe2 implements ActionListener {
	private JButton bt_extracto;
	private JButton bt_levantar;
	private JButton bt_depositar;

	private JButton bt_voltar;

	private JFrame jf_home;
	private JMenuBar jb;
	private JMenu jm_menu;
	private JMenuItem jmi_Ficheiro;
	private JMenuItem jm_sumMenu;
	private JMenuItem jm_Sair;

	private JFrame jf_extracto;
	private JLabel lb_nome;
	private JLabel lb_numConta;
	private JLabel lb_saldo;

	private JFrame jf_levantar;
	private int numLevantamentos = 0;
	private JTextField tf_quatidade;

	private JFrame jf_depositar;

	public Classe2(Conta conta) {
		int numConta = conta.getNum_conta();
		String nome = conta.getNome();
		double saldo = conta.getValorInicial();

		jf_home = new JFrame();
		jb = new JMenuBar();
		jf_home.setJMenuBar(jb);
		jm_menu = new JMenu("Ficheiro");
		jm_sumMenu = new JMenu("Sub-Menu");
		jm_Sair = new JMenuItem("Sair");
		jb.add(jm_menu);

		jm_menu.add(jm_Sair);

		bt_extracto = new JButton("EXTRACTO");
		bt_levantar = new JButton("LEVANTAR");
		bt_depositar = new JButton("DEPOSITAR");

		// ---------------------------------------------------------------------------------------------------------------
		jf_home.setTitle("Home Page");// O tittulo da janela.
		jf_home.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf_home.setLocation(100, 100);// Onde o programa vai arrancar
		jf_home.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf_home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		bt_extracto.addActionListener(this);
		bt_levantar.addActionListener(this);
		bt_depositar.addActionListener(this);
		jm_Sair.addActionListener(this);
		// -------------------------
		jf_home.setLayout(new GridLayout(3, 1, 4, 4));
		jf_home.add(bt_extracto);
		jf_home.add(bt_levantar);
		jf_home.add(bt_depositar);

		jf_extracto = new JFrame();
		lb_numConta = new JLabel("Número de Conta: " + numConta);
		lb_nome = new JLabel("Nome:" + nome);
		lb_saldo = new JLabel("Saldo: " + saldo);

		// ---------------------------------------------------------------------------------------------------------------
		jf_extracto.setTitle("Extracto");// O tittulo da janela.
		jf_extracto.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf_extracto.setLocation(100, 100);// Onde o programa vai arrancar
		jf_extracto.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf_extracto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os
																	// frames
		// --------------------------------------------------------------------------------------------------------------
		jf_extracto.setLayout(new GridLayout(4, 1, 10, 10));
		jf_extracto.add(lb_nome);
		jf_extracto.add(lb_numConta);
		jf_extracto.add(lb_saldo);

	}

	public void visibilidade() {
		jf_home.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		if (e.getSource() == bt_extracto) {
			jf_extracto.setVisible(true);
		}
		if (e.getSource() == bt_levantar) {

			JOptionPane.showInputDialog(null, "");
		}
		if (e.getSource() == bt_depositar) {

			JOptionPane.showMessageDialog(null, "DEPOSITAR");
		}
		if (e.getSource() == jm_Sair) {

			System.exit(0);
		}
	}

}
