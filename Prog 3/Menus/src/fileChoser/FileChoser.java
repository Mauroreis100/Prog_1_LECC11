package fileChoser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FileChoser extends JFrame implements ActionListener {

	private JLabel jl_procurar, jl_caminho;
	private JButton jb_bt;
	private JFileChooser jf;

	public FileChoser() {
		this.setTitle("Procura de Ficheiros");
		this.setSize(350, 150);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		jl_procurar = new JLabel("Procura o ficheiro aqui: ");
		jl_caminho = new JLabel();
		jl_caminho.setForeground(Color.blue);
		jb_bt = new JButton("Procurar");
		jf = new JFileChooser();

		this.add(jl_procurar);
		this.add(jb_bt);
		this.add(jl_caminho);

		jb_bt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb_bt) {
			jf.showOpenDialog(null);
			jl_caminho.setText(jf.getSelectedFile().getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		new FileChoser().setVisible(true);
	}
}
