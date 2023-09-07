package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC1 {
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "1111";

	public static void main(String[] args) {
		try {
			// step1:載入驅動
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("載入成功");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = con.createStatement();) {
			System.out.println("建立驅動");
			int count = stmt.executeUpdate("INSERT INTO department VALUES(50,'人事部','南京復興')");
			System.out.println(count + "row(s) updated.");

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
