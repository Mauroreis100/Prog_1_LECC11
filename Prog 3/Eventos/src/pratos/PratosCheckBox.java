package pratos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class PratosCheckBox {
	private JFrame jf;
	private JCheckBox jcb_prato1;
	private JCheckBox jcb_prato2;
	private JCheckBox jcb_prato3;
	private JCheckBox jcb_prato4;
	private JCheckBox jcb_prato5;
	private JCheckBox jcb_prato6;

	PratosCheckBox() {
		jf = new JFrame();
		jcb_prato1 = new JCheckBox("Feijoada + Dobrada");
		jcb_prato2 = new JCheckBox("Tonga's");
		jcb_prato3 = new JCheckBox("Frango");
		jcb_prato4 = new JCheckBox("Massa boloueta");
		jcb_prato5 = new JCheckBox("Massa Grelhada");
		jcb_prato6 = new JCheckBox("Peixe");
		
		//Como ter o checked no CheckBox ao arrancar o programa
		jcb_prato2.setSelected(true);
		
		
		//Dar a possibilidade de utilizar o teclado, para escolha de itens
		jcb_prato1.setMnemonic(KeyEvent.VK_F);
		jcb_prato2.setMnemonic(KeyEvent.VK_T);
		jcb_prato3.setMnemonic(KeyEvent.VK_G);
		jcb_prato4.setMnemonic(KeyEvent.VK_B);
		jcb_prato5.setMnemonic(KeyEvent.VK_G);
		jcb_prato6.setMnemonic(KeyEvent.VK_P);
		// ---------------------------------------------------------------------------------------------------------------
		jf.setTitle("Pratos");// O tittulo da janela.
		jf.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		jf.setLayout(new GridLayout(6,1));
		jf.add(jcb_prato1);
		jf.add(jcb_prato2);
		jf.add(jcb_prato3);
		jf.add(jcb_prato4);
		jf.add(jcb_prato5);
		jf.add(jcb_prato6);
		jf.setVisible(true);
	}
}
