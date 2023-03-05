package day6;

import java.util.HashSet;
import java.util.Set;

class Fruit{
	
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	
		Fruit target = (Fruit)obj;
		
		return this.name.equals(target.name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return this.name.hashCode();
	}
	
	
	
}

public class HashSetDemo2 {
	
	public static void main(String[] args) {

		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Banana"));
		
		
		// 독립적으로 생성된 객체 주소를 가지지만 hashcode 를 오버라이드 하여 주소를 같게 만듬.
		System.out.println(fruits.size());
		// set의 성질을 이해하면서
		//fruits 의 개수 출력
		// 모든 요소 출력
		fruits.forEach(x -> System.out.println(x));
	
		
		Fruit f1 = new Fruit("PineApple");
		Fruit f2 = new Fruit("PineApple");
		System.out.println(f1.equals(f2));
		System.out.println(f1.hashCode()==f2.hashCode());
	}
}
