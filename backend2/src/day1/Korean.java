package day1;

public class Korean extends People {

	public Korean () 
	{
		super("Kor");
	}
	
	
	@Override
	public String toString() {		
		return super.getLanguage();
	}
	
}
