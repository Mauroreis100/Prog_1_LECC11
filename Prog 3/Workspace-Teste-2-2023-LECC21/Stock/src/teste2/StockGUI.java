package teste2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockGUI extends JFrame implements ActionListener {
	private JTextField tf_nome;
	private JTextField tf_quantidade;
	private JTextField tf_preco;
	private JTextField tf_nota2;

	private JTextArea tf_resultado;
	private JLabel lb_nome, lb_quantidade, lb_preco, lb_nota2;
	private JButton bt_consultar;
	private JButton bt_inserir;
	private JButton bt_apagar;
	private JTable tb_listagem;
	private DefaultTableModel tm_listagemModel;

	public StockGUI() {

		this.setTitle("Aplicativo JDBC com Swing");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lb_nome = new JLabel("Nome:");
		lb_quantidade = new JLabel("quantidade:");

		lb_preco = new JLabel("preco:");
		lb_nota2 = new JLabel("Nota2:");

		tf_nome = new JTextField();
		tf_quantidade = new JTextField();

		tf_preco = new JTextField();
		tf_nota2 = new JTextField();

		tf_resultado = new JTextArea();
		bt_consultar = new JButton("Consultar");
		bt_inserir = new JButton("Inserir");
		bt_apagar = new JButton("Apagar");

		tm_listagemModel = new DefaultTableModel();
		tm_listagemModel.addColumn("ID");
		tm_listagemModel.addColumn("Nome");
		tm_listagemModel.addColumn("quantidade");
		tm_listagemModel.addColumn("preco");
		tm_listagemModel.addColumn("Nota2");
		tm_listagemModel.addColumn("Média");
		tb_listagem = new JTable(tm_listagemModel);
		// Componentes da interface
		JPanel panel = new JPanel(new GridLayout(6, 2));

		panel.add(lb_nome);
		panel.add(tf_nome);
		panel.add(lb_quantidade);
		panel.add(tf_quantidade);
		panel.add(lb_preco);
		panel.add(tf_preco);;
		panel.add(bt_consultar);
		panel.add(bt_inserir);
		panel.add(bt_apagar);

		tf_resultado.setEditable(false);

		bt_consultar.addActionListener(this);
		bt_inserir.addActionListener(this);
		bt_apagar.addActionListener(this);

		add(panel, BorderLayout.NORTH);
		add(new JScrollPane(tb_listagem), BorderLayout.CENTER);
		add(new JScrollPane(tf_resultado), BorderLayout.SOUTH);

	}

	private void consultarDados(StockOperacoes al) {
		tm_listagemModel.setRowCount(0); // Limpa a tabela antes de consultar
		try {
			// Conectar ao banco de dados
			Connection connection = DriverManager.getConnection(al.jdbcURL, al.username, al.password);

			// Preparar consulta SELECT
			String selectQuery = "SELECT * FROM alunos";
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			ResultSet resultSet = preparedStatement.executeQuery();

			// Exibir resultados na �rea de texto
			tf_resultado.setText("");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				int quantidade = resultSet.getInt("preco");
				double preco = resultSet.getDouble("quantidade");
				tf_resultado.append("Nome: " + nome + ", quantidade: " + quantidade + "preco:" + preco);
				tm_listagemModel.addRow(new Object[] { id, nome, quantidade, preco});
			}

			// Fechar a conex�o
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			tf_resultado.setText("Erro: " + e.getMessage());
		}
	}

	private void inserirDados(StockOperacoes al) {
		String nome = tf_nome.getText();
		String quantidade = tf_quantidade.getText();

		String preco = tf_preco.getText();
		try {
			int quantidades = Integer.parseInt(quantidade);

			Connection connection = DriverManager.getConnection(al.jdbcURL, al.username, al.password);

			final String query = "INSERT INTO produto(nome, quantidade, preco) VALUES (?, ?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, quantidade);
			preparedStatement.setString(3, preco);
		

			preparedStatement.executeUpdate();
			System.out.println("Inserido com sucesso");
			connection.close();
			preparedStatement.close();

			// Atualizar a tabela ap�s a inser��o
			consultarDados(al);

		} catch (SQLException | NumberFormatException e) {
			tf_resultado.setText("Erro: " + e.getMessage());
		}
	}

	private void apagarDados(StockOperacoes al) {
		String nome = tf_nome.getText();

		try {

			Connection connection = DriverManager.getConnection(al.jdbcURL, al.username, al.password);

			final String query = "DELETE FROM produto WHERE nome = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, nome);

			preparedStatement.executeUpdate();
			System.out.println("Removido com sucesso");
			connection.close();
			preparedStatement.close();

			// Atualizar a tabela ap�s a inser��o
			consultarDados(al);

		} catch (SQLException | NumberFormatException e) {
			tf_resultado.setText("Erro: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		StockGUI app = new StockGUI();
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StockOperacoes al = new StockOperacoes();
		if (e.getSource() == bt_consultar) {
			consultarDados(al);
		}
		if (e.getSource() == bt_inserir) {
			inserirDados(al);
		}
		if (e.getSource() == bt_apagar) {
			apagarDados(al);
		}

	}
}
