package pratos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;
public class PratosCheckBox extends JFrame implements ActionListener{


	private JCheckBox jcb_prato1;
	private JCheckBox jcb_prato2;
	private JCheckBox jcb_prato3;
	private JCheckBox jcb_prato4;
	private JCheckBox jcb_prato5;
	private JCheckBox jcb_prato6;
	
	private JMenuBar jb;
	private JMenu jm_menu;
	private JMenuItem jm_jmi;

	public PratosCheckBox() {

		jb=new JMenuBar();
		this.setJMenuBar(jb);
		jm_menu=new JMenu("Menu 1");
		jb.add(jm_menu);
		
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
		
		
		//MENU SET
		
		
		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Pratos");// O tittulo da janela.
		this.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		this.setLayout(new GridLayout(10,1));
		this.add(jcb_prato1);
		this.add(jcb_prato2);
		this.add(jcb_prato3);
		this.add(jcb_prato4);
		this.add(jcb_prato5);
		this.add(jcb_prato6);
		this.add(jb, BorderLayout.NORTH);
		
		jcb_prato1.addActionListener(this);
		
//		this.setVisible(true); Como n#ao é a pprincipal e é chamada
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jcb_prato1) {
			
			JOptionPane.showConfirmDialog(null,jcb_prato1.getText());
			System.out.println("YA");
//			int b=Integer.parseInt(jcb_prato1.getText());
		}
	}
}
