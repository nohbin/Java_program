package day1;

class Eagle extends Animal {
	
	
	String wing;

	void fly() {
		
	}
}

class Tiger extends Animal {
	String leg;

	void run() {

	}
}

class GoldFish extends Animal {
	String fin;

	void swim() {

	}
}

public class Animal {

	public String eye;
	public String mouth;

	public void eat() {

	}

	public void sleep() {

	}

	public static void main(String[] args) {
		Eagle e = new Eagle();
		Tiger t= new Tiger();
		GoldFish g = new GoldFish();
		
	}
}


