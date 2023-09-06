package cardlayout;
import javax.swing.*;
import java.awt.*;
public class Card_Layout {
	//criar um frame 
	 private JFrame frame; 
	//criar 3 paineis
	 private JPanel panel1; 
	 private JPanel panel2; 
	 private JPanel panel3; 
	//criando rotulos
	 private JLabel jl_janela1; 
	 private JButton jb_janela2; 
	 private JTextField jtf_janela3; 
	//criar dois botões 
	 private JButton bt_1; 
	 private JButton bt_2; 
	 private JButton bt_3; 
	 
	 private JPanel selectPanel; 
	 private JPanel cardLayoutPanel; 
	 
	 public Card_Layout() {
		 frame = new JFrame(); 
		 panel1= new JPanel(); 
		 panel2 = new JPanel(); 
		 panel3 = new JPanel(); 
		 frame.setTitle("Card Layout"); 
		 frame.setSize(400,300); 
		 frame.setLocation(50,50); 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 frame.setLayout(new BorderLayout()); 
		 
		 jl_janela1 = new JLabel("Este é a janela do panel 1"); 
		 jb_janela2 = new JButton("Este é o botão do panel 2"); 
		 jtf_janela3 = new JTextField(25); 
		 
		 bt_1 = new JButton("Painel 1"); 
		 bt_2 = new JButton("Painel 2"); 
		 bt_3 = new JButton("Painel 3"); 
		 
		 selectPanel = new JPanel(); 
		 cardLayoutPanel = new JPanel(); 
		 selectPanel.setLayout(new GridLayout(1,3)); 
		 selectPanel.add(bt_1); 
		 selectPanel.add(bt_2);
		 selectPanel.add(bt_3); 
		 
		 panel1.add(jl_janela1); 
		 panel2.add(jb_janela2); 
		 panel3.add(jtf_janela3); 
		 
		 cardLayoutPanel.setLayout(new CardLayout()); 
		 
		 cardLayoutPanel.add(panel1, "P1"); 
		 cardLayoutPanel.add(panel2, "P2"); 
		 cardLayoutPanel.add(panel3, "P3"); 
		 
		 frame.add("North", selectPanel); 
		 frame.add("East", cardLayoutPanel);
//		 bt_1.addActionListener(this); 
//		 bt_2.addActionListener(this); 
//		 bt_3.addActionListener(this);
		 frame.setVisible(true);
		 
//		 @Override
//		 public void actionPerformed(ActionEvent action) { 
//		  CardLayout cardLayout = (CardLayout) cardLayoutPanel.getLayout(); 
//		  if(action.getSource() == bt_1) 
//		  { 
//		  cardLayout.show(cardLayoutPanel, "P1"); 
//		  } 
//		  if(action.getSource() == bt_2) 
//		  { 
//		  cardLayout.show(cardLayoutPanel, "P2"); 
//		  } 
//		  if(action.getSource() == bt_3) 
//		  { 
//		  cardLayout.show(cardLayoutPanel, "P3"); 
//		  } 
//		  
//		  } 
	 }
}
