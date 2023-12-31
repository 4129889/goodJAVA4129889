package jdbctest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "1111";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();
		
		sc.close();

		try {
			// step1:載入驅動
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("載入成功");
			// step2:建立驅動
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("建立驅動");
			//step3:送出SQL指令
			pstmt = con.prepareStatement("insert into department values (?,?,?)");
			
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			pstmt.executeUpdate();
			
			
			
			
			
			
//			stmt = con.createStatement();
////			int count = stmt.executeUpdate("INSERT INTO department VALUES(50,'人事部','南京復興')");
////			System.out.println(count + "row(s) updated.");
//			
//			rs = stmt.executeQuery("select * from department order by deptno desc");
//			while(rs.next()) {
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				System.out.println("DEPTNO =" + deptno);
//				System.out.println("DNAME =" + dname);
//				System.out.println("LOC =" + loc);
//				System.out.println("============");
//			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
	}
}
