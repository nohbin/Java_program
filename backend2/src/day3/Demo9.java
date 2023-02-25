package day3;

import java.util.ArrayList;
import java.util.List;

public class Demo9 {

	public static void main(String[] args) {
		
	List<Wearable> lists = new ArrayList<>();
	lists.add(new WearableComputer());
	lists.add(new WearableComputer());
	lists.add(new HeadPhone());
	
	for (Wearable w : lists) {
		w.putIn();
		w.putOut();
	}
	}
	
	
}
