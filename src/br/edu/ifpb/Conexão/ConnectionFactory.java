package br.edu.ifpb.Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
		} catch (SQLException e) {
			System.out.println("erro de conexcao");
			throw new RuntimeException(e);
		}
	}
}