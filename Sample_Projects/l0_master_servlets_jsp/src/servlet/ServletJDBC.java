package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registeration") 
public class ServletJDBC extends HttpServlet{
	private static Connection connection;
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Compiled");
		String uname = request.getParameter("username");
		String upass = request.getParameter("password");
		long num = Integer.parseInt(request.getParameter("no"));
		jdbc db = new jdbc();
		db.insertDB(uname, upass, num);
		
		request.setAttribute("value", uname);
		
		try {
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	
	@Override
	public void init() throws ServletException {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","oracle");
			System.out.println(connection);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static Connection getConnection() {
		System.out.println(connection);
		return connection;
	}
}
