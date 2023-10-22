package menuListener;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuListen extends JFrame implements ActionListener, MouseListener{
//Para implementar mais que uma interface basta colocar vírgula
	private JPanel jp_Form;
	private JPanel jp_Buttons;
	private JLabel lb_nome;
	private JLabel lb_senha;
	private TextField tf_nome;
	private TextField tf_senha;
	private JButton bt_limpar;
	private JButton bt_submeter;
	
	

	MenuListen() {

		jp_Form = new JPanel();
		jp_Buttons = new JPanel();

		lb_nome = new JLabel("Nome: ");
		lb_senha = new JLabel("Senha: ");

		bt_limpar = new JButton("Limpar");
		bt_submeter = new JButton("Submeter");

		tf_nome = new TextField(25);
		tf_senha = new TextField(25);
		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Linguagem de Programação II");// O tittulo da janela.
		this.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		
		//Listeners para Action
		bt_submeter.addActionListener(this);
		bt_limpar.addActionListener(this);
		
		//Listeners para MouseListeners
		bt_submeter.addMouseListener(this);
		bt_limpar.addMouseListener(this);
		lb_nome.addMouseListener(this);
		tf_senha.addMouseListener(this);
		
		this.setLayout(new FlowLayout());
		jp_Form.setLayout(new GridLayout(2,2,2,2));
		jp_Buttons.setLayout(new GridLayout(0,2,2,2));;
		
		
		jp_Form.add(lb_nome);
		jp_Form.add(tf_nome);
		jp_Form.add(lb_senha);
		jp_Form.add(tf_senha);
		
		jp_Buttons.add(bt_limpar);
		jp_Buttons.add(bt_submeter);
		this.add(jp_Form,BorderLayout.CENTER);
		this.add(jp_Buttons, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == bt_limpar) {
			tf_nome.setText("");
			tf_senha.setText("");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt_submeter) {
			JOptionPane.showMessageDialog(null, "MouseClicked() method called");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == lb_nome) {
			JOptionPane.showMessageDialog(null, "MousePressed() method called");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tf_senha && tf_nome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "\n Senha? MouseEntered() method called.");
		}
			
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tf_senha && !tf_nome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "\n Tudo bem, podes continuar\n MouseExited() method called.");
		}
	}

}

