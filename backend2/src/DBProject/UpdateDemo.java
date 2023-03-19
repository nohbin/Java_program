package DBProject;

import java.util.HashMap;
import java.util.Map;

public class UpdateDemo {
public static void main(String[] args) {
	DBManager db = new DBManager();
	Map<String, Object> updateMap = new HashMap<>();
	updateMap.put("name", "nohbin");
	updateMap.put("age", 20);
	
	System.out.println( db.updataData("4", updateMap) ? "good" : "bad");
	
	
	
}
}
