package buttons_exercise;

import java.awt.*;
import javax.swing.*;

public class ImagemBotao {
//Essas imagens são muito pequenas e existem na internet, icone
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

	private JFrame jf;

	ImagemBotao() {
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

		// ---------------------------------------------------------------------------------------------------------------
		jf.setTitle("Imagem no botãa");// O tittulo da janela.
		jf.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		jf.setLayout(new GridLayout(3, 2, 30, 10));
		jf.add(bt_cancelar);
		jf.add(bt_submeter);
		jf.add(bt_cancelar);
		jf.add(bt_anterior);
		jf.add(bt_proximo);
		jf.add(bt_novo);
		jf.setVisible(true);
	}
}
