package dao;

public class SingletoneDemo {
	public static void main(String[] args) {

		Singletone s1 = Singletone.getInstance();
		s1.setId(100);
		System.out.println("s1 id : " + s1.getId());
		
		Singletone s2 = Singletone.getInstance();
		s2.setId(200);
		System.out.println("s1 id : " + s1.getId());
		System.out.println("s2 id : " + s2.getId());
		
	}

}
