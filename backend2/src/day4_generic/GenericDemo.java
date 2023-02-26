package day4_generic;

import day4.Beer;
import day4.Boricha;

public class GenericDemo {

	public static void main(String[] args) {

//		Cup c = new Cup();
//
//		c.setBeverage(new Boricha());
//		Boricha boricha = (Boricha) c.getBeverage();
//
//		c.setBeverage(new Beer());
//		Beer beer = (Beer) c.getBeverage();
//		
		
		Cup<Boricha> c = new Cup<>();	
		c.setBeverage(new Boricha());
		Boricha bori = c.getBeverage();
		
		Cup<Beer> c2 = new Cup<>();
		c2.setBeverage(new Beer());
		Beer beer = c2.getBeverage();
		
		
		
	}

}
