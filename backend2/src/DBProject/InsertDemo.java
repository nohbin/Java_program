package DBProject;

import java.util.HashMap;
import java.util.Map;

public class InsertDemo {
	public static void main(String[] args) {

	DBManager dbm = new DBManager();
	Map<String, Object> insertMap = new HashMap<>();
	insertMap.put(STUDENTCOL.NAME.toString(), "성노빈");
	insertMap.put(STUDENTCOL.AGE.toString(), 32);
	insertMap.put(STUDENTCOL.GENDER.toString(), 1);
	insertMap.put(STUDENTCOL.GRADE.toString(), 2);
	insertMap.put(STUDENTCOL.TYPE.toString(), 1);
	
	if(dbm.insertData(insertMap)) {
		System.out.println("good");
	}else System.out.println("bad");
	

	
	insertMap.put(STUDENTCOL.NAME.toString(), "nohbin");

	
	}
}
