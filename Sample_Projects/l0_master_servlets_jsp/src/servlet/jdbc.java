package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc extends ServletJDBC {
	void insertDB(String username, String password, long num) {
		try {

			Connection connection = getConnection();
			// Connection connection = ServletJDBC.getConnection(); ~ Without extending ServletJDBC
			System.out.println(connection);
			Statement statement = connection.createStatement();
			System.out.println(statement);
			int status = statement.executeUpdate("insert into register values ('"
					+ username + "','" + password + "','" + num +"')");
			System.out.println(status);
			if (status == 1) {
				System.out.println("Record Inserted!");
			}
			else {
				System.out.println("Error");
			}
		}  catch (SQLException e) {
			System.out.println(e);
		}
	}
}
