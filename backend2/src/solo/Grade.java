package solo;

public interface Grade {

	double TOP = 0.2;
	double VIP= 0.1;
	double GENERAL= 0.05;
	
	double reward(int price);
	
}
