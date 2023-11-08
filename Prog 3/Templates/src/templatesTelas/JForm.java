package templatesTelas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JForm extends JFrame {

	JForm() {

		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Template de JForm");// O tittulo da janela.
		this.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JForm();
	}

}
