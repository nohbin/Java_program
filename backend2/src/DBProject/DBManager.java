package DBProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

enum STUDENTCOL{
	NAME{
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}		
	},
	AGE{
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}		
	},
	GENDER{
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}		
	},
	GRADE{
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}		
	},
	TYPE{
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}		
	}
}


public class DBManager implements DBHandler , AutoCloseable {

	private  final String URL = "jdbc:mysql://localhost:3306/javadb"; 
	private  final String ID = "javadb"; 
	private  final String PW = "javadb"; 
	private  Connection conn;
	
	
	public DBManager() {
		super();
		connectDB();
	}

	@Override
	public Connection connectDB() {
		
		  try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		      conn = DriverManager.getConnection(URL, ID, PW);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return conn;	
		    
		    
	}
	
	@Override
	public boolean insertData(Map<String, Object> datas) {
		
		String sql = "insert into student(name,age,gender,grade,type) values(?,?,?,?,?)";
		
		try  ( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				)	
		{		
			pstmt.setString(1, (String)datas.get(STUDENTCOL.NAME.toString()));
			pstmt.setInt(2, (int)datas.get(STUDENTCOL.AGE.toString()));
			pstmt.setInt(3, (int)datas.get(STUDENTCOL.GENDER.toString()));
			pstmt.setInt(4, (int)datas.get(STUDENTCOL.GRADE.toString()));
			pstmt.setInt(5, (int)datas.get(STUDENTCOL.TYPE.toString()));			
			if(pstmt.executeUpdate() == 1) return true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	
	public List<Map<String, Object>> selectData() {
		
//		String sql = "select * from student where id = ?";
//		
//		ResultSet rs = null;
//		Map<String, Object> data = new HashMap<>();
//		List<Map<String, Object>> lists = new ArrayList<>();
//		try (
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//			)
//			
//		{			
//			pstmt.setInt(1, id);	
//			rs = pstmt.executeQuery();
//			
//            if (rs.next()) {
//                int studentId = rs.getInt("id");
//                String name = rs.getString("name");
//                int age = rs.getInt("age");
//                int grade = rs.getInt("grade");
//                int type = rs.getInt("type");
//                // add the data to the map
//                data.put("id", studentId);
//                data.put("name", name);
//                data.put("age", age);
//                data.put("grade", grade);
//                data.put("type", type);
//			}
//            lists.add(data);
//		}
//			
//		 catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return lists;
		
		String sql = "select * from student";
		List<Map<String, Object>> lists = new ArrayList<>();
		try(
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				) 
		
		{
			while (rs.next()) {
				Map<String, Object> m = new HashMap<>();
				m.put("name", rs.getString("name"));
				m.put("id", rs.getInt("id"));
				m.put("age", rs.getInt("age"));
				m.put("gender", rs.getInt("gender"));
				m.put("grade", rs.getInt("grade"));
				m.put("type", rs.getInt("type"));
			lists.add(m);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lists;
	}


	@Override
	public boolean updataData(String id, Map<String, Object> datas) {
		
//		update student set ? = '홍순이' where id = 2;
		String sql = "update student set ";
//			sql += " set name = 'nohbin'";
//			sql += " where id = ?";
			
			for (Entry<String, Object> entry : datas.entrySet()) {
				
				sql += entry.getKey() + " = '" + entry.getValue()+ "' ," ;
			}
			// update student set name = 동해 ,age = 20 ,
		sql = sql.substring(0,sql.length()-1);		
		sql += " where id = "+id;
	
		try  ( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				)	
		{		
			if(pstmt.executeUpdate() == 1) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean deleteData(String id) {
		String sql = "delete from student where id = ?";
		
		try ( 
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) 
		
		{		
			pstmt.setString(1, id);
			pstmt.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public void close() throws Exception {
		conn.close();
		System.out.println("closed");
		
	}

}
