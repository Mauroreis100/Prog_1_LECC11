package registroFrutas;

import javax.swing.*;
import java.awt.*;

public class RegistroFrutas {
	private JFrame jf;
	private JLabel lb_titulo;
	private JLabel lb_escolha;
	private JComboBox cb_frutas;

	private JList lt_frutas;

	private JPanel jp_titulo;
	private JPanel jp_elementos;

	private JTextArea jta_comentario;
	
	private JScrollPane sc;

	String[] frutas;

	RegistroFrutas() {
		jf = new JFrame();
		jp_titulo = new JPanel();
		jp_elementos = new JPanel();

		lb_titulo = new JLabel("Tela de registro de frutas");
		lb_titulo.setFont(new Font("Aerial", Font.BOLD, 30));
		lb_titulo.setForeground(Color.blue);
		lb_escolha = new JLabel("Escolha a fruta favorita: ");

		jta_comentario = new JTextArea(5, 20);

		frutas = new String[] { "Maracujá", "Maçã", "Manga", "Milho" };
		JComboBox cb_frutas = new JComboBox(frutas);// Só deixa escolher 1 item

		JList lt_frutas = new JList(frutas);// Permite escolher muitos itens

		
		sc=new JScrollPane(jta_comentario);//Deve estas em baixo do TextArea
		// --------------------------------------------------------------------------------------------
		jf.setTitle("Componentes.exe");// O tittulo da janela.
		jf.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		jf.setLayout(new GridLayout(2, 1));
		// ------------------------------------------------------------------------------------------
		jp_titulo.add(lb_titulo, BorderLayout.WEST);
		jp_elementos.add(lb_escolha);
		jp_elementos.add(cb_frutas);
		jp_elementos.add(lt_frutas);
		jp_elementos.setBackground(Color.CYAN);
		jp_elementos.add(sc);
		jf.add(jp_titulo);
//		jf.add(new JLabel(""));
		jf.add(jp_elementos);
		/*
		 * Field- textos pequenos 
		 * TextArea - Texto grande
		 */
		jf.setVisible(true);
	}
}
