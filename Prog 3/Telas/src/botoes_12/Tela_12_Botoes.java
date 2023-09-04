package botoes_12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela_12_Botoes {

	// Criando váriavel da tela
	private JFrame jf;

	private JButton bt_1;
	private JButton bt_2;
	private JButton bt_3;
	private JButton bt_4;
	private JButton bt_5;
	private JButton bt_6;
	private JButton bt_7;
	private JButton bt_8;
	private JButton bt_9;
	private JButton bt_10;
	private JButton bt_11;
	private JButton bt_12;

	
	public Tela_12_Botoes() {
		// Instâncias componentes
				jf = new JFrame();

				// Como os botões devem aparecer
				bt_1 = new JButton("#1");
				bt_2 = new JButton("#2");
				bt_3 = new JButton("#3");
				bt_4 = new JButton("#4");
				bt_5 = new JButton("#5");
				bt_6 = new JButton("#6");
				bt_7 = new JButton("#7");
				bt_8 = new JButton("#8");
				bt_9 = new JButton("#9");
				bt_10 = new JButton("#10");
				bt_11 = new JButton("#11");
				bt_12 = new JButton("#12");			

				jf.setTitle("12 Botões");// Nome da tela
				jf.setSize(370, 140);// Tamanho da tela
				jf.setLocation(100, 100);// Onde arrancar
				jf.setLocationRelativeTo(null);
				jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				jf.setLayout(new GridLayout(3,12,10,10));//Linhas x Colunas
				
				//jf.setLayout(new BorderLayoutFrame());
				//jf.setLayout(new FlowLayout());// 

				// Adicionando botões ao Frame
				jf.add(bt_1);
				jf.add(bt_2);
				jf.add(bt_3);
				jf.add(bt_4);
				jf.add(bt_5);
				jf.add(bt_6);
				jf.add(bt_7);
				jf.add(bt_8);
				jf.add(bt_9);
				jf.add(bt_10);
				jf.add(bt_11);
				jf.add(bt_12);
				
				
				// TUDO VISÍVEL
				jf.setVisible(true);

			}
	}

