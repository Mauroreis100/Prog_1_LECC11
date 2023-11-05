package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Classe1 implements ActionListener {
//--AUTENTICAÇÃO------------------------------
	private JFrame jf_autenticacao;

	private JPanel jp_Form;
	private JPanel jp_Buttons;

	private JLabel lb_nome;
	private JLabel lb_senha;

	private TextField tf_nome;
	private TextField tf_senha;

	private JButton bt_limpar;
	private JButton bt_submeter;
	// --AUTENTICAÇÃO------------------------------
	private JFrame jf_conta;
	private JPanel jp_Form_conta;
	private JPanel jp_Buttons_conta;

	private JLabel lb_nome_conta;
	private JLabel lb_valor_inicial;

	private TextField tf_nome_conta;
	private TextField tf_valor_inicial;

	private JButton bt_limpar_conta;
	private JButton bt_comecar;

	public Classe1() {
		jf_autenticacao = new JFrame();
		jf_conta = new JFrame();
		jp_Form = new JPanel();
		jp_Buttons = new JPanel();

		lb_nome = new JLabel("Utilizador: ");
		lb_senha = new JLabel("Senha: ");

		bt_limpar = new JButton("Limpar");
		bt_submeter = new JButton("Entrar");

		tf_nome = new TextField(25);
		tf_senha = new TextField(25);
		// ---------------------------------------------------------------------------------------------------------------
		jf_autenticacao.setTitle("Autenticação");// O tittulo da janela.
		jf_autenticacao.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf_autenticacao.setLocation(100, 100);// Onde o programa vai arrancar
		jf_autenticacao.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf_autenticacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os
																		// frames
		// --------------------------------------------------------------------------------------------------------------

		// Listeners
		bt_submeter.addActionListener(this);
		bt_limpar.addActionListener(this);

		jf_autenticacao.setLayout(new FlowLayout());
		jp_Form.setLayout(new GridLayout(2, 2, 2, 2));
		jp_Buttons.setLayout(new GridLayout(0, 2, 2, 2));
		;

		jp_Form.add(lb_nome);
		jp_Form.add(tf_nome);
		jp_Form.add(lb_senha);
		jp_Form.add(tf_senha);

		jp_Buttons.add(bt_limpar);
		jp_Buttons.add(bt_submeter);
		jf_autenticacao.add(jp_Form, BorderLayout.CENTER);
		jf_autenticacao.add(jp_Buttons, BorderLayout.SOUTH);
		jf_autenticacao.setVisible(true);

//---------------------CONTA-------------------------------------------------------------
		jp_Form_conta = new JPanel();
		jp_Buttons_conta = new JPanel();

		lb_nome_conta = new JLabel("Nome: ");
		lb_valor_inicial = new JLabel("Valor Inicial");

		bt_limpar_conta = new JButton("Limpar");
		bt_comecar = new JButton("Começar");

		tf_nome_conta = new TextField(25);
		tf_valor_inicial = new TextField(25);
//		// ---------------------------------------------------------------------------------------------------------------
		jf_conta.setTitle("Conta - Start");// O tittulo da janela.
		jf_conta.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf_conta.setLocation(100, 100);// Onde o programa vai arrancar
		jf_conta.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf_conta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------

		// Listeners
		bt_comecar.addActionListener(this);
		bt_limpar_conta.addActionListener(this);

		jf_conta.setLayout(new FlowLayout());
		jp_Form_conta.setLayout(new GridLayout(2, 2, 2, 2));
		jp_Buttons_conta.setLayout(new GridLayout(0, 2, 2, 2));
		;

		jp_Form_conta.add(lb_nome_conta);
		jp_Form_conta.add(tf_nome_conta);
		jp_Form_conta.add(lb_valor_inicial);
		jp_Form_conta.add(tf_valor_inicial);

		jp_Buttons_conta.add(bt_limpar_conta);
		jp_Buttons_conta.add(bt_comecar);
		jf_conta.add(jp_Form_conta, BorderLayout.CENTER);
		jf_conta.add(jp_Buttons_conta, BorderLayout.SOUTH);
//		jf_conta.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == bt_submeter) {
			if (tf_nome.getText().equals("admin") && tf_senha.getText().equals("0000")) {
				jf_autenticacao.setVisible(false);
				jf_conta.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "UTILIZADOR INEXISTENTE, TENTE DENOVO\nSENHA INVÁLIDA");
			}
		}
		// -----------------------CONTA--------------------------
		if (e.getSource() == bt_limpar) {
			tf_nome.setText("");
			tf_senha.setText("");
		}
		if (e.getSource() == bt_comecar) {
			Conta account = new Conta();
			account.setNome(tf_nome_conta.getText().toString());
			double valorIni = Double.parseDouble(tf_valor_inicial.getText());

			Random numconta = new Random(100);
			// ID DEVE SER POSITIVO
			int num = 0;
			do {
				num = numconta.nextInt();
				account.setNum_conta(num);
				account.setValorInicial(valorIni);
			} while (num < 0);

			Classe2 home = new Classe2(account);
		
			System.out.println("INICIADO COM SUCESSO COM" + account.toString());
			home.visibilidade();
			jf_conta.setVisible(false);
		}

	}

}
