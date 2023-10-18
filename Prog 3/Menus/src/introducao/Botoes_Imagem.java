package introducao;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import pratos.PratosCheckBox;

public class Botoes_Imagem extends JFrame implements ActionListener{
	private JButton bt_cancelar;
	private JButton bt_submeter;
	private JButton bt_anterior;
	private JButton bt_proximo;
	private JButton bt_novo;

	private ImageIcon img_cancelar;
	private ImageIcon img_submeter;
	private ImageIcon img_anterior;
	private ImageIcon img_proximo;
	private ImageIcon img_novo;
	
	private JLabel lb_botoes;

	private JPanel jp_botoes_2;
	
//	private JFrame jf;

	Botoes_Imagem(){
		
		img_cancelar = new ImageIcon("src/buttons_exercise/cancelar.png");
		img_submeter = new ImageIcon("src/buttons_exercise/submeter.png");
		img_anterior = new ImageIcon("src/buttons_exercise/anterior.png");
		img_proximo = new ImageIcon("src/buttons_exercise/proximo.png");
		img_novo = new ImageIcon("src/buttons_exercise/novo.png");

		bt_cancelar = new JButton("Cancelar", img_cancelar);
		bt_submeter = new JButton("Submeter", img_submeter);
		bt_anterior = new JButton("Anterior", img_anterior);
		bt_proximo = new JButton("Proximo", img_proximo);
		bt_novo = new JButton("Novo", img_novo);
		
		//Continuar images ou só imagem ou TPC fazer o ToolTipText para cada 
		bt_cancelar.setToolTipText("Afaste o mouse de mim faxavor");
		
		lb_botoes=new JLabel("Botões com Imagens");
		lb_botoes.setForeground(Color.BLUE);
		
		bt_cancelar.addActionListener(this);
		bt_submeter.addActionListener(this);
		jp_botoes_2=new JPanel();
		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Imagem no botão");// O tittulo da janela.
		this.setSize(300, 700);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		this.setLayout(new FlowLayout(5,1,5));
		jp_botoes_2.setLayout(new GridLayout(1,2,3,1));
		this.add(lb_botoes);
		this.add(bt_cancelar);
		jp_botoes_2.add(bt_submeter);
		jp_botoes_2.add(bt_novo);
		this.add(jp_botoes_2);
		this.add(bt_proximo);
		this.add(bt_anterior);
		this.setVisible(true);
}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt_cancelar) {

			JOptionPane.showConfirmDialog(null, bt_cancelar.getText());
			System.out.println("YA");
		}
		if (e.getSource() == bt_submeter) {
			new PratosCheckBox().setVisible(true);
			this.setVisible(false);
		}
		if (e.getSource() == bt_novo) {

			JOptionPane.showConfirmDialog(null, bt_novo.getText());
			System.out.println("YA");
		}
		if (e.getSource() == bt_anterior) {

			JOptionPane.showConfirmDialog(null, bt_anterior.getText());
			System.out.println("YA");
		}
	}
	
}

