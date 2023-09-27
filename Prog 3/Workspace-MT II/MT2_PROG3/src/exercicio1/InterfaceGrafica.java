package exercicio1;

import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica {
private JFrame jf_exercicio;

private JPanel jp_buttons;
private JPanel jp_center_top;
private JPanel jp_center;
private JPanel jp_center_bottom;
private JPanel jp_bottom;

private ImageIcon banner;
	
	private JLabel lb_banner;
	private JLabel lb_nome;
	private JLabel lb_curso;
	private JLabel lb_diversao;
	private JLabel lb_sexo;
	private JLabel lb_direitos;

	private JButton bt_limpar;
	private JButton bt_submeter;
	private JButton bt_programador;

	private JTextField tf_nome;

	
	private JComboBox jc_cursos;

	private JList lst_lista;

	private JRadioButton rb_Masculino;
	private JRadioButton rb_Femenino;
	private ButtonGroup gb;
	
private JTextArea jta_azul;

	private JScrollPane sc;
	
	String[] opcoes;
	String[] variados;

	InterfaceGrafica() {
		jf_exercicio=new JFrame();
		
		//Jpanels
		jp_buttons=new JPanel();
		jp_center_top=new JPanel();
		jp_center=new JPanel();
		jp_center_bottom=new JPanel();
		jp_bottom=new JPanel();
		
		//Imagem 
		banner=new ImageIcon("src/assets/banner.png");
		
		//JLabels
		lb_nome=new JLabel("Nome");
		lb_banner=new JLabel(banner);
		lb_curso=new JLabel("Curso: ");
		lb_diversao=new JLabel("Diversão: ");
		lb_sexo=new JLabel("Sexo:");
		lb_direitos=new JLabel("==========Direitos reservado ao autor @Mujhahid==========");
		lb_direitos.setFont(new Font("Aerial", Font.ITALIC, 20));
		lb_direitos.setForeground(Color.blue);
		//Butões
		bt_limpar=new JButton("Limpar");
		bt_submeter=new JButton("Submeter");
		bt_programador=new JButton("Programador");
		
		//JTextField
		tf_nome=new JTextField(20);
		//JComboBox
		opcoes = new String[] { "Escolha uma opção", "Informática", "Contabilidade", "Civil","Auditoria" };
		jc_cursos=new JComboBox(opcoes);	
		//JRadioButton
		rb_Masculino=new JRadioButton("Masculino");
		rb_Femenino=new JRadioButton("Femenino");
		//RadioGroup
		gb=new ButtonGroup();
		
		//TextArea
		jta_azul = new JTextArea(10, 25);
		jta_azul.setBackground(Color.cyan);
			//Scroll
			sc=new JScrollPane(jta_azul);
			sc.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			
		//Lista
		variados=new String[] {"Futebol","Andebol","Internet","Ler"};
		lst_lista=new JList(variados);
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		jf_exercicio.setTitle("Exercício 1");// O tittulo da janela.
		jf_exercicio.setSize(760, 370);// Width and Height em pixels.[Comprimento, Largura]
		jf_exercicio.setLocation(100, 100);// Onde o programa vai arrancar
		jf_exercicio.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf_exercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		jp_buttons.setLayout(new GridLayout(3,1,1,2));
		jp_center_top.setLayout(new GridLayout(1,4,1,2));
		jp_center_bottom.setLayout(new GridLayout(1,5,1,2));
		jp_center.setLayout(new GridLayout(2,1,12,10));
		//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		jf_exercicio.getContentPane().add(sc);
		//Adições ao RadioGroup
		gb.add(rb_Masculino);
		gb.add(rb_Femenino);
		
		//Container de Botões:
		jp_buttons.add(bt_limpar);
		jp_buttons.add(bt_submeter);
		jp_buttons.add(bt_programador);
		
		//Container componentes no CENTRO-TOPO)
		jp_center_top.add(lb_nome);
		jp_center_top.add(tf_nome);
		jp_center_top.add(lb_curso);
		jp_center_top.add(jc_cursos);
		
		//Container componentes no CENTRO-SUL
		jp_center_bottom.add(lb_sexo);
		jp_center_bottom.add(rb_Masculino);
		jp_center_bottom.add(rb_Femenino);
		jp_center_bottom.add(lb_diversao);
		jp_center_bottom.add(lst_lista);
		
		//Conteiner no Centro
		jp_center.add(jp_center_top);
		jp_center.add(jp_center_bottom);
		
		//Container componentes no SUL
		jp_bottom.add(lb_direitos);
		
		//Adições JFrame
		jf_exercicio.add(lb_banner, BorderLayout.NORTH);
		jf_exercicio.add(jp_buttons,BorderLayout.WEST);
		jf_exercicio.add(jp_center,BorderLayout.CENTER);
		jf_exercicio.add(jta_azul,BorderLayout.EAST);
		jf_exercicio.add(jp_bottom,BorderLayout.SOUTH);
		
		
		jf_exercicio.setVisible(true);
	}
}
