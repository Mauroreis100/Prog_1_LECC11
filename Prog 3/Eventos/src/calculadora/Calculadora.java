package calculadora;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculadora extends JFrame implements ActionListener{

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
		
		jp_Calc=new JPanel();
		jp_Buttons=new JPanel();
		
		lb_numero1=new JLabel("Numero 1:");
		lb_numero2=new JLabel("Numero 2:");
		lb_resultado=new JLabel("Resultado:");
		
		tf_numero1=new TextField(10);
		tf_numero2=new TextField(10);
		tf_resultado=new TextField(10);
//		tf_resultado.setEnabled(false);//Inválido
//		tf_resultado.setEnabled(true);//Inválido
		
		
		bt_OK=new JButton("OK");
		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Linguagem de Programação II");// O tittulo da janela.
		this.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------
		tf_resultado.setEditable(false);
		
		//LISTENERS
		bt_OK.addActionListener(this);
	
		
		
		this.setLayout(new FlowLayout());
		jp_Calc.setLayout(new FlowLayout(4,4,10));
		jp_Buttons.setLayout(new FlowLayout(4,4,4));
		
		jp_Calc.add(lb_numero1);
		jp_Calc.add(tf_numero1);
		jp_Calc.add(lb_numero2);
		jp_Calc.add(tf_numero2);
		jp_Buttons.add(lb_resultado);
		jp_Buttons.add(tf_resultado);
		jp_Buttons.add(bt_OK);
		
		this.add(jp_Calc);
		this.add(jp_Buttons);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt_OK) {
			int a=Integer.parseInt(tf_numero1.getText());
			int b=Integer.parseInt(tf_numero2.getText());
			int res=a+b;
			tf_resultado.setBackground(Color.YELLOW);;
			tf_resultado.setText(res+"");
		}
	}
	
	

}
