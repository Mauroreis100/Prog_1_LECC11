package divisaoTelaExercicio;

import javax.swing.*;
import java.awt.*;


public class DivisaoTela {
	private JFrame jf;

	private ImageIcon imagem;
	private JLabel lb_foto;

	private JButton bt_cancelar;
	private JButton bt_submeter;
	private JButton bt_limpar;

	private JPanel jp_left;
	private JPanel jp_right;

	private ButtonGroup gb;
	DivisaoTela() {
		jf = new JFrame();
		jp_left = new JPanel();
		jp_right = new JPanel();
		bt_cancelar = new JButton("Cancelar");
		bt_submeter = new JButton("Submeter");
		bt_limpar = new JButton("Limpar");
		imagem=new ImageIcon("src/componentes/assets/ISUTC.png.png");
		lb_foto=new JLabel(imagem);
		
		gb = new ButtonGroup();
		// --------------------------------------------------------------------------------------------
		jf.setTitle("RadioButton.exe");// O tittulo da janela.
		jf.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		jf.setLayout(new GridLayout(1,2));
		// ------------------------------------------------------------------------------------------
		jp_right.setBackground(Color.cyan);
		jf.add(jp_left);
		jf.add(jp_right);
		jf.setVisible(true);
	}
}
