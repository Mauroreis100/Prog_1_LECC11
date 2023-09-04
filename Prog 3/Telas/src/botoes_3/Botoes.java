package botoes_3;

import java.awt.*;
import javax.swing.*;

public class Botoes {

	// Criando váriavel da tela
	private JFrame jf;

	private JButton bt_anterior;
	private JButton bt_centro;
	private JButton bt_proximo;
	
	public Botoes() {
		// Instâncias componentes
		jf = new JFrame();

		// Como os componentes devem aparecer

		bt_anterior = new JButton("Anterior");
		bt_centro = new JButton("CENTRO");
		bt_proximo = new JButton("Próximo");

		jf.setTitle("Autenticação");// Nome da tela
		jf.setSize(370, 140);// Tamanho da tela
		jf.setLocation(100, 100);// Onde arrancar
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setLayout(new FlowLayout(FlowLayout.CENTER));// Linhas x Colunas

		// Adicionando botões ao Frame
		jf.add(bt_anterior);
		jf.add(bt_centro);
		jf.add(bt_proximo);
		// TUDO VISÍVEL
		jf.setVisible(true);

	}
}
