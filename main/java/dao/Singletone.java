package dao;

public class Singletone {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private Singletone() {} 
	private static Singletone instance = null;
	
	public static Singletone getInstance(){
		if(instance == null) {
			instance = new Singletone();
		}
		return instance;
	}
}
