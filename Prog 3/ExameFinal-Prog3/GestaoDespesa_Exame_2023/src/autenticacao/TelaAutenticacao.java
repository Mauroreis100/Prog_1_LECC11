package autenticacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAutenticacao extends JFrame implements ActionListener{
	private JTextField tf_admin;
	private JPasswordField pf_senha;
	private JButton bt_entrar;
	private JLabel lb_nome, lb_senha;

	TelaAutenticacao() {
		lb_nome = new JLabel("Utilizador");
		lb_senha = new JLabel("Senha");

		tf_admin = new JTextField(5);
		pf_senha = new JPasswordField();

		bt_entrar = new JButton("ENTRAR");
		// ---------------------------------------
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setSize(700, 400);
		this.setLayout(new GridLayout(4,2));
		// ----------------------------------------
		bt_entrar.addActionListener(this);
		this.add(lb_nome);
		this.add(tf_admin);
		this.add(lb_senha);
		this.add(pf_senha);
		this.add(bt_entrar);
		
		this.setVisible(true);
	}


	public static void main(String[] args) {
		new TelaAutenticacao();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((e.getSource()==bt_entrar)&& (tf_admin.getText().equals("admin"))&&(pf_senha.getText().equals("2222"))) {
			System.out.println("Entrou");
		}else {
			JOptionPane.showMessageDialog(null, "Utilizador ou senha iválido");
		}
	}
}
