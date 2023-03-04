package solo;

public class General implements Grade {

	@Override
	public double reward(int price) {
		// TODO Auto-generated method stub
		return price * GENERAL;
	}

	@Override
	public String toString() {
		return "GENERAL";
	}
}
