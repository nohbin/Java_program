package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * jdbc programming 순서
 * 1. jdbc 드라이버(mysql_connector) load 및 database 연결
 * 2. sql문 실행
 * 3. ResultSet 객체 처리 // Collection Set 함수
 * 4. 자원객체를 닫는다.
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
//		String url = "jdbc::mysql://localhost/contacts?serverTimezone=Asia/Seoul";

		String url = "jdbc:mysql://localhost:3306/javadb"; // version 성공!

		// 1. jdbc 드라이버(mysql_connector) load 및 database 연결
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("database 연결중....");
			conn = DriverManager.getConnection(url, "javadb", "javadb");
			System.out.println("database 연결성공");

			String str = "insert into student(name,age,gender,grade,type) values('김철수',12,0,1,1)"; // SQL 문 작성
			stmt = conn.createStatement(); // 실행창?
			int result = stmt.executeUpdate(str);
			if (result > 0)
				System.out.println("data insert in sucesss");
			else
				System.out.println("fail");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}
}
