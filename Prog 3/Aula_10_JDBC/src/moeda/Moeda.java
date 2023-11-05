package moeda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Moeda extends JFrame implements ActionListener {

	private JPanel jp_Form;
	private JPanel jp_Buttons;

	private JLabel lb_nome;
	private JLabel lb_senha;

	private TextField tf_nome;
	private TextField tf_senha;

	private JButton bt_limpar;
	private JButton bt_submeter;
	private JButton bt_consultar;
	// Configura��es de conex�o
	final String jdbcURL = "jdbc:mysql://localhost:3306/escola";
	String username = "root";
	String password = "12345";
	
	Moeda() {

		jp_Form = new JPanel();
		jp_Buttons = new JPanel();

		lb_nome = new JLabel("Nome: ");
		lb_senha = new JLabel("Idade: ");

		bt_limpar = new JButton("Apagar");
		bt_consultar = new JButton("Consultar");
		bt_submeter = new JButton("Inserir");

		tf_nome = new TextField(25);
		tf_senha = new TextField(25);
		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Aplicativo JDBC com Swing");// O tittulo da janela.
		this.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------

		// Listeners------------------------------
		bt_submeter.addActionListener(this);
		bt_limpar.addActionListener(this);
		bt_consultar.addActionListener(this);
		// Listeners------------------------------
		
		this.setLayout(new FlowLayout());
		jp_Form.setLayout(new GridLayout(2, 2, 2, 2));
		jp_Buttons.setLayout(new GridLayout(0, 2, 2, 2));
		;

		jp_Form.add(lb_nome);
		jp_Form.add(tf_nome);
		jp_Form.add(lb_senha);
		jp_Form.add(tf_senha);

		jp_Buttons.add(bt_limpar);
		jp_Buttons.add(bt_submeter);
		jp_Buttons.add(bt_consultar);
		this.add(jp_Form, BorderLayout.CENTER);
		this.add(jp_Buttons, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==bt_submeter) {
			try {
				// Carregando o driver JDBC
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Estabelecendo uma conex�o com o banco de dados
				Connection connection = DriverManager.getConnection(jdbcURL, username, password);

				// Consulta SELECT
				String insertSQL = "INSERT INTO escola (nome,idade) VALUES ("+tf_nome.getText()+","+tf_senha.getText()+")";
				PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
				insertStatement.setString(1, tf_nome.getText());//DÚVIDA: PQ ter estes dois linha 90 n faz o mesmo
				insertStatement.setString(2, tf_senha.getText());
				int linhasInseridas = insertStatement.executeUpdate();
				// Processando os resultados
				insertStatement.close();
				insertStatement.close();
				connection.close();
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}finally {
			}
		}
		try {
			// Carregando o driver JDBC
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Estabelecendo uma conex�o com o banco de dados
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);

			// Consulta SELECT
			String selectQuery = "SELECT * FROM alunos";
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			ResultSet resultSet = preparedStatement.executeQuery();

			// Processando os resultados
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");
				System.out.println("ID: " + id + ", Nome: " + nome + ", Idade: " + idade);
			}

			// Fechando a conex�o
			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		new Moeda();
	}

}
/*Constructor, colocar conexões de username numa outra classe
 * Consultar tens de conectar sempre, e sempre fechar
 * 
 * Ao inserir
 * */

