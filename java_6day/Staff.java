package java_6day;

public class Staff {

	public Staff() {

	}

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public Staff setAge(int age) {
		this.age = age;
		return this;
	}

	public String getName() {
		return name;
	}

	public Staff setName(String name) {
		this.name = name;
		return this;
	}

	public static void sayHello() {
	//	System.out.printf("%s 야 반갑다 나는 %d 살이야 \n",name,age);
	}

}
