package DBProject;

import java.util.List;
import java.util.Map;

public class SelectDemo {
	public static void main(String[] args) {

		DBManager db = new DBManager();
		List<Map<String, Object>> result = db.selectData();
		
		result.forEach(x->System.out.println(x));
		
		
		
		
	}
}
