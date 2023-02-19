package day1;

public class American extends People {

	public American () 
	{
		super("Eng");
	}


	@Override
	public String toString() {		
		return super.getLanguage();
	}
	
	
	
}
