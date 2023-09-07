package module03_09;

/*
 *  userName = 1' OR '1'='1
 * 	userPassword = 1' OR '1'='1;
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import util.Util;

public class HelloJDBC2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stat = null;
		ResultSet rs = null;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
//		
//		sc.close();
		

		String userEmail = "", userPassword = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入名稱: ");
		userEmail = sc.nextLine();
		System.out.println("請輸入密碼: ");
		userPassword = sc.nextLine();

		try {
			Class.forName(Util.DRIVER);
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			System.out.println("Connecting to database successfully! (連線成功！)");

			stat = con.createStatement();
			rs = stat.executeQuery(
					"SELECT * FROM membership WHERE (email = '" + userEmail + "') AND (pass = '" + userPassword + "')");
			
			
			
			
			
			/*
			 * 駭客們所稱呼的"填空遊戲"，將鍵盤輸入資料當做變數所組合成的SQL句子： SELECT * FROM membership WHERE
			 * (email = '1' OR '1'='1') and (pass = '1' OR '1'='1');
			 */

			while (rs.next()) {
				System.out.println("User ID: " + rs.getInt("id"));
				System.out.println("User name: " + rs.getString("email"));
				System.out.println("User password: " + rs.getString("pass"));
				System.out.println();
			}

		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		} finally {
			// 依建立順序關閉資源 (越晚建立越早關閉)
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException se) {
					System.out.println(se);
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					System.out.println(se);
				}
			}
			sc.close();
		}
	}
}
