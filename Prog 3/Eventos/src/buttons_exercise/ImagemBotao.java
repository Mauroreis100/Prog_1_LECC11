package buttons_exercise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class ImagemBotao extends JFrame implements ActionListener{
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
/*
 * Sockets usamos para conectar 2 computadores e Threads executação de tarefas com tempo, 
 * Duas páginas de Sockets
 * Duas páginas de threads
 * Fazer o Socket Cliente
 * Fazer o Socket Servidor
 * Fazer Chat- 
 * Segunda feira Entrega e Correcção
 * Dica: para comunicar deves conhecer o IP do servidor e a porta
 * 
 * */
	ImagemBotao() {
	
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
		this.setTitle("Imagem no botãa");// O tittulo da janela.
		this.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		this.setLayout(new GridLayout(3, 2, 30, 10));
		this.add(bt_cancelar);
		this.add(bt_submeter);
		this.add(bt_cancelar);
		this.add(bt_anterior);
		this.add(bt_proximo);
		this.add(bt_novo);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
