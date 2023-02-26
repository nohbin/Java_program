package day4_generic;

public class Customer {

	private String name;	
	private String value;	
	private String grade;
	private double reserves;
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getReserves() {
		if(getGrade().equals("VIP")){
			setReserves ((Double.parseDouble(getValue())*0.1));
	}else if(getGrade().equals("TOP")){
			setReserves ((Double.parseDouble(getValue())*0.2));
	}else if (getGrade().equals("GENERAL")){
		setReserves ((Double.parseDouble(getValue())*0.05));
}
	
		return reserves;
	}
	public void setReserves(double reserves) {
		this.reserves = reserves;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getGrade() {
		return grade;
	}
	


	
	
}
