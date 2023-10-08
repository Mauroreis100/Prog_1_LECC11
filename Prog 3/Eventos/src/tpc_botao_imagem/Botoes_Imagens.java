package tpc_botao_imagem;

import java.awt.*;

import javax.swing.*;

public class Botoes_Imagens {
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
	
	private JFrame jf;
	Botoes_Imagens(){
		jf = new JFrame();
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
		
		lb_botoes=new JLabel("Botões com Imagens");
		lb_botoes.setForeground(Color.BLUE);
		
		jp_botoes_2=new JPanel();
		// ---------------------------------------------------------------------------------------------------------------
		jf.setTitle("Imagem no botãa");// O tittulo da janela.
		jf.setSize(300, 700);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		jf.setLayout(new FlowLayout(5,1,5));
		jp_botoes_2.setLayout(new GridLayout(1,2,3,1));
		jf.add(lb_botoes);
		jf.add(bt_cancelar);
		jp_botoes_2.add(bt_submeter);
		jp_botoes_2.add(bt_novo);
		jf.add(jp_botoes_2);
		jf.add(bt_proximo);
		jf.add(bt_anterior);
		jf.setVisible(true);
}
}
