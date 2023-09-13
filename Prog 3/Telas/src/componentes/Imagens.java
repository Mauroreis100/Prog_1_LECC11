package componentes;

import java.awt.GridLayout;

import javax.swing.*;
import java.awt.*;

public class Imagens {
	private JFrame jf;
	//PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO
	
	private JLabel lb_imagem;
	private ImageIcon imagem;
	
	private JLabel lb_cor;
	private JLabel lb_vermelho;
	private JLabel lb_azul;
	private JLabel lb_amarelo;
	private JLabel lb_verde;
	
	private JButton bt_Cancelar;
	private JButton bt_Submeter;
	private JButton bt_Limpar;
	
	private JPanel jp;
	
	

	public Imagens() {
		jf = new JFrame();
		imagem=new ImageIcon("src/componentes/assets/ISUTC.png.png");
		lb_imagem=new JLabel(imagem);
		jp=new JPanel();
		
		lb_vermelho=new JLabel("Cor Vermelho");
		lb_azul=new JLabel("Cor Azul");
		lb_verde=new JLabel("Cor Verde");
		lb_amarelo=new JLabel("Cor Amarelo");
		
		bt_Cancelar=new JButton("Cancelar");
		bt_Submeter=new JButton("Submeter");
		bt_Limpar=new JButton("Limpar");
		
		//Inicializar componentes
		jf.setTitle("FOTO.exe");//O tittulo da janela.
		jf.setSize(700,700);//Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100,100);//Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);//Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Quando o utilizador clicar no x. Mata todos os frames
		
		lb_vermelho.setForeground(Color.red);
		lb_azul.setForeground(Color.blue);
		lb_verde.setForeground(Color.green);
		lb_amarelo.setForeground(Color.yellow);
		
		
		bt_Cancelar.setBackground(Color.blue);
		bt_Submeter.setBackground(Color.green);
		bt_Limpar.setBackground(Color.gray);
		
		bt_Cancelar.setForeground(Color.white);
		bt_Submeter.setForeground(Color.black);

		
		jp.setLayout(new GridLayout(4,2,10,10));
		jf.add(lb_imagem);
		jp.add(lb_vermelho);
		jp.add(bt_Limpar);
		jp.add(lb_amarelo);
		jp.add(bt_Cancelar);
		jp.add(lb_azul);
		jf.add(lb_verde);
		jp.add(bt_Submeter);
		jf.add(BorderLayout.WEST, jp);
		jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		jf.setVisible(true);
	}
}
