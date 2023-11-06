package teste2;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UI_stock extends JFrame implements ActionListener {

	private JPanel jp_Form;
	private JPanel jp_Buttons;

	private JLabel lb_nome;
	private JLabel lb_preco, lb_quantidade;

	private TextField tf_nome;
	private TextField tf_preco, tf_quantidade;

	private JButton bt_Adicionar;
	private JButton bt_excluir, bt_listar;

	private JTable tb_listagem;
	private DefaultTableModel tm_listagemModel;
	final String jdbcURL = "jdbc:mysql://localhost:3306/stock";
	final String username = "root";
	final String password = "12345";
	UI_stock() {

		jp_Form = new JPanel();
		jp_Buttons = new JPanel();

		lb_nome = new JLabel("Nome: ");
		lb_preco = new JLabel("Preço: ");
		lb_quantidade = new JLabel("Quantidade: ");

		bt_Adicionar = new JButton("Adicionar");
		bt_excluir = new JButton("Excluir");
		bt_listar = new JButton("Listar");

		tf_nome = new TextField(25);
		tf_preco = new TextField(25);
		tf_quantidade = new TextField(25);

		tm_listagemModel = new DefaultTableModel();
		tm_listagemModel.addColumn("ID");
		tm_listagemModel.addColumn("Nome");
		tm_listagemModel.addColumn("Preço");
		tm_listagemModel.addColumn("Quantidade");
		tb_listagem = new JTable(tm_listagemModel);
		// ---------------------------------------------------------------------------------------------------------------
		this.setTitle("Stock");// O tittulo da janela.
		this.setSize(500, 300);// Width and Height em pixels.[Comprimento, Largura]
		this.setLocation(100, 100);// Onde o programa vai arrancar
		this.setLocationRelativeTo(null);// Onde o programa vai arrancar
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Quando o utilizador clicar no x. Mata todos os frames
		// --------------------------------------------------------------------------------------------------------------

		// Listeners
		bt_excluir.addActionListener(this);
		bt_Adicionar.addActionListener(this);
		bt_listar.addActionListener(this);

		this.setLayout(new FlowLayout());
		jp_Form.setLayout(new GridLayout(3, 2, 2, 2));
		jp_Buttons.setLayout(new GridLayout(0, 3, 2, 2));
		;

		jp_Form.add(lb_nome);
		jp_Form.add(tf_nome);
		jp_Form.add(lb_preco);
		jp_Form.add(tf_preco);

		jp_Form.add(lb_quantidade);
		jp_Form.add(tf_quantidade);

		jp_Buttons.add(bt_Adicionar);
		jp_Buttons.add(bt_excluir);
		jp_Buttons.add(bt_listar);
		this.add(jp_Form, BorderLayout.CENTER);
		this.add(jp_Buttons, BorderLayout.SOUTH);
		this.add(new JScrollPane(tb_listagem), BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		// TODO Auto-generated method stub
		if (action.getSource() == bt_Adicionar) {
			String nome = tf_nome.getText();
			String preco = tf_preco.getText();
			String quantidade = tf_quantidade.getText();
			try {
				int idade = Integer.parseInt(preco);
		
				Connection connection = DriverManager.getConnection(jdbcURL, username, password);
//				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root",
//						"12345");

				final String query = "INSERT INTO produto(nome, preco, quantidade) VALUES (?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, nome);
				preparedStatement.setString(2, preco);
				preparedStatement.setString(3, quantidade);

				preparedStatement.executeUpdate();
				System.out.println("Inserido com sucesso");
				connection.close();
				preparedStatement.close();
				ListarActualizada();
				// Atualizar a tabela ap�s a inser��o
//				consultarDados(al);

			} catch (SQLException | NumberFormatException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
		if (action.getSource() == bt_excluir) {
			String id=JOptionPane.showInputDialog("Insira o ID que deseja apagar");

			try {

				Connection connection = DriverManager.getConnection(jdbcURL, username, password);

				final String query = "DELETE FROM produto WHERE id = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, id);

				preparedStatement.executeUpdate();
				System.out.println("Removido com sucesso");
				connection.close();
				preparedStatement.close();
				ListarActualizada();
				// Atualizar a tabela ap�s a inser��o
//				consultarDados(al);

			} catch (SQLException | NumberFormatException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
		if (action.getSource() == bt_listar) {
			ListarActualizada();
		}
		
	}
	private void ListarActualizada() {
		tm_listagemModel.setRowCount(0); // Limpa a tabela antes de consultar
		try {
			// Conectar ao banco de dados
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);

			// Preparar consulta SELECT
			String selectQuery = "SELECT * FROM produto";
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			ResultSet resultSet = preparedStatement.executeQuery();


			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				double preco = resultSet.getDouble("preco");
				double quantidade = resultSet.getDouble("quantidade");
//				double media=(nota1+nota2)/2;
//				tf_resultado.append("Nome: " + nome + ", Idade: " + idade + "Nota1:" + nota1 + "Nota2:" + nota2 +"Média:" + media+"\n");
				tm_listagemModel.addRow(new Object[] { id, nome, preco, quantidade});
			}

			// Fechar a conex�o
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	public static void main(String[] args) {

		new UI_stock();
	}
}
