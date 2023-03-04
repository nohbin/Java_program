package solo;

public class Top implements Grade {

	@Override
	public double reward(int price) {
		// TODO Auto-generated method stub
		return price * TOP;
	}

	
	@Override
	public String toString() {
		return "TOP";
	}
}
