package day6;

public class Student {
	private String name;
	
	public String getName() {
		return name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			return this.name.equals(((Student) obj).name);
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
	
	
	
	

}
