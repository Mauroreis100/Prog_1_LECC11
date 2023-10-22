package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import pratos.PratosCheckBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;

public class MenuItem extends JFrame implements ActionListener {

	private JPanel jp_botoes_2;
	private JMenuBar jb;
	private JMenu jm_menu1;
	private JMenu jm_menu2;
	private JMenu jm_menu3;

	private JMenuItem jmi_salvar;
	private JMenuItem jmi_abrir;
	private JMenuItem jmi_sair;

	private JMenuItem jmi_texto;
	private JMenuItem jmi_sair2;

	private JCheckBoxMenuItem jcmni_data;
	private JCheckBoxMenuItem jcmni_tipo;

	private JMenu jm_subitem;

	private JRadioButtonMenuItem jrbmi_verificacao;
	private JRadioButtonMenuItem jrbmi_compilador;

	MenuItem() {
		jb = new JMenuBar();
		this.setJMenuBar(jb);
		jm_menu1 = new JMenu("Menu 1");
		jm_menu2 = new JMenu("Menu 2");
		jm_menu3 = new JMenu("Menu 3");
		jm_subitem = new JMenu("Sub-Menu");
		jb.add(jm_menu1);
		jb.add(jm_menu2);
		jb.add(jm_menu3);

		jmi_salvar = new JMenuItem("Salvar");
		jmi_abrir = new JMenuItem("Abrir");
		jmi_sair = new JMenuItem("Fechar");

		jmi_texto = new JMenuItem("Texto");
		jcmni_data = new JCheckBoxMenuItem("Data");
		jcmni_tipo = new JCheckBoxMenuItem("Tipo");
		jrbmi_verificacao = new JRadioButtonMenuItem("Verificação de Sintax");
		jrbmi_compilador = new JRadioButtonMenuItem("Compilador");
		jmi_sair2 = new JMenuItem("Sair");
		JComboBox jc_submenu = new JComboBox();

		jm_menu1.add(jmi_salvar);
		jm_menu1.addSeparator();
		jm_menu1.add(jmi_abrir);
		jm_menu1.addSeparator();
		jm_menu1.add(jmi_sair);

		jm_menu2.add(jmi_texto);
		jm_menu2.addSeparator();
		jm_menu2.add(jcmni_data);
		jm_menu2.add(jcmni_tipo);
		jm_menu2.addSeparator();
		jm_menu2.add(jrbmi_verificacao);
		jm_menu2.add(jrbmi_compilador);
		jm_menu2.addSeparator();
		jm_menu2.add(jm_subitem);
		jm_menu2.addSeparator();
		jm_menu2.add(jmi_sair2);

		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Imagem no botão");// O tittulo da janela.
		this.setSize(300, 700);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		jm_menu1.setMnemonic(KeyEvent.VK_M);
		jm_menu2.setMnemonic(KeyEvent.VK_E);
		jm_menu3.setMnemonic(KeyEvent.VK_U);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jmi_sair) {
			System.exit(0);
		}

	}
}
