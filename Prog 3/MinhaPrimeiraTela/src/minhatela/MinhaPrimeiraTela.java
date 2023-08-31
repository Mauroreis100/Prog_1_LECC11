//A aula de hoje é sobre boas práticas e comentários
package minhatela;

import java.awt.*;

import javax.swing.*;

public class MinhaPrimeiraTela {
	private JFrame jf;
	//PARA QUALQUER JANELA TENS QUE COMEÇAR COM ISTO
	
	//Criando um botão:
	private JButton bt_submeter;
	
	//Criando a componente label
	private JLabel lb_introduza;
	
	//Cirando o campo de texto
	private JTextField tf_campoInicial;

	public MinhaPrimeiraTela() {
		jf = new JFrame();//PARA QUALQUER JANELA DEVE COMEÇAR COM ISTO
		//Inicializações de variáveis: 
		bt_submeter = new JButton("OK");//Inicializei o componente dentro do construtor
		lb_introduza = new JLabel("Utilizador");//Texto da label
		tf_campoInicial = new JTextField("@1234567890");	
		//Inicializar componentes
		jf.setTitle("GTA VI.exe");//O tittulo da janela.
		jf.setSize(500,500);//Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100,100);//Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);//Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Quando o utilizador clicar no x. Mata todos os frames
		//jf.setLayout(new FlowLayout(FlowLayout.CENTER));
		//jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		//jf.setLayout(new FlowLayout(align,altura,espaco entre eles));
		
		jf.setLayout(new GridLayout(3,2));
//jf.setLayout(new FlowLayout(FlowLayout.RIGHT));
		/*O FlowLayout recebe um parametro de alinhamento da esquenda para a direita, por definião 
		Se quero que comece do centro para a esquerda uso jf.setLayout(new FlowLayout(FlowLayout.CENTER));
		, Ou da direita para esquerda coloco FlorLatyout..RIGHT. 
		O FlowLayout ajusta os componentes de acordo com o tamanho da tela
		*/
		
		
		
		//Adicionar Botões
		jf.add(lb_introduza);
		jf.add(tf_campoInicial);
		jf.add(bt_submeter);//Adicionar o botão na tela
		
		/*jf.add(bt_submeter, BorderLayout.EAST);//Adicionar o botão na telajf.add(lb_introduza, BorderLayout.WEST);jf.add(tf_campoInicial, BorderLayout.SOUTH);*/
		
		jf.setVisible(true);//Se não colocar a tela ñ aparece. É a ultima instrução no programa
		/*Saber para que Hardware estamos a fazer*/
	}
}
