package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexaoJDBC {
	public static void main(String[] args) {
		// Configura
		final String jdbcURL = "jdbc:mysql://localhost:3306/escola";
		String username = "root";
		String password = "12345";

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

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
