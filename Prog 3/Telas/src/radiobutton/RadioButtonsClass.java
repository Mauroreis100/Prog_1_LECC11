package radiobutton;

import javax.swing.*;
import java.awt.*;
public class RadioButtonsClass {
	private JFrame jf;
	
	private JLabel lb_sexo;
	
	private JRadioButton rb_masc;
	private JRadioButton rb_femn;
	
	private ButtonGroup gb;
	
	private JPanel jp_bt;
	
	RadioButtonsClass(){
		jf = new JFrame();
		jp_bt = new JPanel();
		lb_sexo=new JLabel("Escolha o sexo:");
		rb_masc = new JRadioButton("Masculino");
		rb_femn = new JRadioButton("Femenino");
		gb=new ButtonGroup();
		// --------------------------------------------------------------------------------------------
				jf.setTitle("RadioButton.exe");// O tittulo da janela.
				jf.setSize(700, 300);// Width and Height em pixels.[Comprimento, Largura]
				jf.setLocation(100, 100);// Onde o programa vai arrancar
				jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
				jf.setLayout(new FlowLayout());
		// ------------------------------------------------------------------------------------------
				gb.add(rb_femn);
				gb.add(rb_masc);
				jp_bt.add(rb_femn);
				jp_bt.add(rb_masc);
				jf.add(lb_sexo);
				jf.add(jp_bt);
				jf.setVisible(true);
		
	}
}
