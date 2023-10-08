package calculadora;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculadora implements ActionListener{
	private JFrame jf;

	private JPanel jp_Calc;
	private JPanel jp_Buttons;

	private JLabel lb_numero1;
	private JLabel lb_numero2;
	private JLabel lb_resultado;

	private TextField tf_numero1;
	private TextField tf_numero2;
	private TextField tf_resultado;

	private JButton bt_OK;
	
	Calculadora(){
		jf=new JFrame();
		
		jp_Calc=new JPanel();
		jp_Buttons=new JPanel();
		
		lb_numero1=new JLabel("Numero 1:");
		lb_numero2=new JLabel("Numero 2:");
		lb_resultado=new JLabel("Resultado:");
		
		tf_numero1=new TextField(10);
		tf_numero2=new TextField(10);
		tf_resultado=new TextField(10);
		tf_resultado.setEnabled(false);//Inválido
		
		bt_OK=new JButton("OK");
		// ---------------------------------------------------------------------------------------------------------------
		jf.setTitle("Linguagem de Programação II");// O tittulo da janela.
		jf.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		jf.setLocation(100, 100);// Onde o programa vai arrancar
		jf.setLocationRelativeTo(null);// Onde o programa vai arrancar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		
		
		//LISTENERS
		bt_OK.addActionListener(this);
	
		
		
		jf.setLayout(new FlowLayout());
		jp_Calc.setLayout(new FlowLayout(4,4,10));
		jp_Buttons.setLayout(new FlowLayout(4,4,4));
		
		jp_Calc.add(lb_numero1);
		jp_Calc.add(tf_numero1);
		jp_Calc.add(lb_numero2);
		jp_Calc.add(tf_numero2);
		jp_Buttons.add(lb_resultado);
		jp_Buttons.add(tf_resultado);
		jp_Buttons.add(bt_OK);
		
		jf.add(jp_Calc);
		jf.add(jp_Buttons);
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt_OK) {
			int a=Integer.parseInt(tf_numero1.getText());
			int b=Integer.parseInt(tf_numero2.getText());
			int res=a+b;
			tf_resultado.setText(res+"");
		}
	}
	
	

}
