package autenticacao;
import java.awt.*;
import javax.swing.*;
public class Autenticacao {
	
//Criando váriavel da tela
private JFrame jf;

private JLabel lb_utilizador;//Label Utilizador
private JTextField tf_utilizador;//Campo de texto user

private JLabel lb_password;//Label password
private JPasswordField tf_password;//Campo de texto password

private JButton bt_limpar;
private JButton bt_submeter;

public Autenticacao() {
	//Instâncias componentes
	jf = new JFrame();
	
	//Como os componentes devem aparecer
	lb_utilizador= new JLabel("Utilizador");
	tf_utilizador=new JTextField("User");
	
	lb_password= new JLabel("Password");
	tf_password=new JPasswordField("");
	
	bt_limpar= new JButton("Limpar");
	bt_submeter=new JButton("Submeter");
	
	jf.setTitle("Autenticação");//Nome da tela
	jf.setSize(370,140);//Tamanho da tela
	jf.setLocation(100,100);//Onde arrancar
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	jf.setLayout(new GridLayout(3,2));//Linhas x Colunas
	
	//Adicionando botões ao Frame
	jf.add(lb_utilizador);
	jf.add(tf_utilizador);
	
	jf.add(lb_password);
	jf.add(tf_password);
	
	jf.add(bt_limpar);
	jf.add(bt_submeter);
	
	//TUDO VISÍVEL
	jf.setVisible(true);
	
	
	
}

}
