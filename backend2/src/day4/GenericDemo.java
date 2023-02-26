package day4;

public class GenericDemo {

	public static void main(String[] args) {

		Cup c = new Cup();

		c.setBeverage(new Boricha());
		Boricha boricha = (Boricha) c.getBeverage();

		c.setBeverage(new Beer());
		Beer beer = (Beer) c.getBeverage();
		
		
		
	}

}
