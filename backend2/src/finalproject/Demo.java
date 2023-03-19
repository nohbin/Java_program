package finalproject;

import java.sql.*;




public class Demo {
	
	private  final static String URL = "jdbc:mysql://localhost:3306/javadb"; 
	private  final static String ID = "javadb"; 
	private  final static String PW = "javadb"; 
	private static  Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	
	public static void main(String[] args)  {
		
		
		
			try {
			// 1 . DB 접속

			//-dirver load		
			Class.forName("com.mysql.cj.jdbc.Driver");
			//-DB 접속정보를 가지고 실제 접속 (db 서버 경로 , 아이디 , 패스워드)
			conn = DriverManager.getConnection(URL,ID,PW);
			conn.setAutoCommit(false); // **** 자동 커밋 방지/
			
			// - query 생성
			String sql = "insert into product(id,name,price) values(?,?,?)";
			//쿼리문 실행을 위한 객체 생성
			pstmt = conn.prepareStatement(sql);
			//쿼리문 동적으로 들어갈
			pstmt.setString(1, "002");
			pstmt.setString(2, "Computer");
			pstmt.setString(3, "100,000");
			// 쿼리문 실행 INSERT
			pstmt.executeUpdate(); // INSERT , UPDATE or DELETE;
			
			// 쿼리문 UPDATE //update student set name = '홍순이' where id = 2;
			sql = "update product set name = 'TV' where id = '001'";
			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.executeUpdate();
			
			// SELECT 선택
//			sql = "select * from product";		
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery(sql);
//						
//			while (rs.next()) {
//				System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("price"));
//			}
			
			// 실행 시 건 별로 실행 되는 걸 한번에 실행 할 수 있게 만드는 커밋 과 롤백;
			
			conn.commit(); // **** 업데이트 되는 걸 허락한다.
			}
			catch (Exception e) {
				e.printStackTrace();
				try {
					conn.rollback(); // 시간을 되돌리는 마법;
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			
			
			
			
			

		
	}
}
