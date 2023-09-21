package formularioconta;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
public class Form_Consulta {
private JFrame jf_consulta;

private JLabel jb_codigo;
private JLabel jb_nome;
private JLabel jb_endereco;
private JLabel jb_telefone;
private JLabel jb_cpf;
private JLabel jb_num_conta;

private TextField tf_codigo;
private TextField tf_num_conta;
private TextField tf_nome;
private TextField tf_endereco;
private TextField tf_cpf;
private TextField tf_telefone;

private JRadioButton rb_contaCorrente;
private JRadioButton rb_contaPoupanca;

private JButton bt_consultar;
private JButton bt_atualizar;
private JButton bt_fechar;

private JPanel jp_top;
private JPanel jp_middle;
private JPanel jp_bottom;
private JPanel jp_footer;

private ButtonGroup bg_opcoes;

private JSeparator sp_linha1;
private JSeparator sp_linha2;
Form_Consulta(){
	jf_consulta=new JFrame();
	
	//Labels
	jb_codigo=new JLabel("Código da Agência:");
	jb_num_conta=new JLabel("Número da conta:");
	jb_nome=new JLabel("Nome:");
	jb_endereco=new JLabel("Endereço:");
	jb_telefone=new JLabel("Telefone:");
	jb_cpf=new JLabel("CPF:");
	
	//Campos de texto
	tf_codigo=new TextField(10);
	tf_num_conta=new TextField(10);
	tf_nome=new TextField(25);
	tf_endereco=new TextField(25);
	tf_cpf=new TextField(25);
	tf_telefone=new TextField(25);
	
	//Radio Buttons and Group
	rb_contaCorrente=new JRadioButton("Conta Corrente");
	rb_contaPoupanca=new JRadioButton("Conta Poupança");
	bg_opcoes=new ButtonGroup();
	
	//Butões
	bt_consultar=new JButton("Consultar");
	bt_atualizar=new JButton("Atualizar");
	bt_fechar=new JButton("Fechar");
	
	
	//Panels
	jp_top=new JPanel();
	jp_middle=new JPanel();
	jp_bottom=new JPanel();
	jp_footer=new JPanel();
	
	//Separador
	sp_linha1=new JSeparator();
	sp_linha2=new JSeparator();

	// --------------------------------------------------------------------------------------------
	jf_consulta.setTitle("Linguagem de Programação II");// O tittulo da janela.
	jf_consulta.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
	jf_consulta.setLocation(100, 100);// Onde o programa vai arrancar
	jf_consulta.setLocationRelativeTo(null);// Onde o programa vai arrancar
	jf_consulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
	jp_top.setBorder(new LineBorder(Color.BLACK,3));
	jp_middle.setBorder(new LineBorder(Color.BLACK,3));
	jp_bottom.setBorder(new LineBorder(Color.BLACK,3));
	jp_footer.setBorder(new LineBorder(Color.BLACK,3));
	//Flow Layout(hORIZONTAL SPACING, VERTICAL SPACING)
	jf_consulta.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
	jp_top.setLayout(new FlowLayout(1,2,2));
	jp_middle.setLayout(new GridLayout(4,1));
	jp_bottom.setLayout(new GridLayout(1,2,10,0));
//	jf_consulta.setLayout(new BorderLayout(8,9));
// ------------------------------------------------------------------------------------------
	
	//Radio Buttons
	bg_opcoes.add(rb_contaCorrente);
	bg_opcoes.add(rb_contaPoupanca);
	
	
	//Top Label
	jp_top.add(jb_codigo);
	jp_top.add(tf_codigo);
	jp_top.add(jb_num_conta);
	jp_top.add(tf_num_conta);

	//Divisão
	
	//Meio
	jp_middle.add(jb_nome);
	jp_middle.add(tf_nome);
	jp_middle.add(jb_endereco);
	jp_middle.add(tf_endereco);
	jp_middle.add(jb_telefone);
	jp_middle.add(tf_telefone);
	jp_middle.add(jb_cpf);
	jp_middle.add(tf_cpf);
	
	//BOTTOM
	jp_bottom.add(rb_contaCorrente);
	jp_bottom.add(rb_contaPoupanca);
	
	//FOOTER
	jp_footer.add(bt_consultar);
	jp_footer.add(bt_atualizar);
	jp_footer.add(bt_fechar);
	
	//ADIÇÃO AO FRAME
	jf_consulta.add(jp_top);
	jf_consulta.add(sp_linha1);//JSeparator
	
	jf_consulta.add(jp_middle, BorderLayout.CENTER);
	jf_consulta.add(jp_bottom);
	jf_consulta.add(sp_linha2);//JSeparator
	jf_consulta.add(jp_footer);
	
	
	jf_consulta.setVisible(true);
	
}

}
