package day1;

public class InheritanceDemo1 {
public static void main(String[] args) {
	Circle c1 = new Circle();
	Ball c2 = new Ball("red",5.0);
	System.out.println("원 : ");
	c1.findRadius();
	c1.findArea();
	
	System.out.println("\n공 : ");
	c2.findRadius();
	c2.findColor();
	c2.findArea();
	c2.findVolume();
}

}
