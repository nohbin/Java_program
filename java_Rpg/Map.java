package java_Rpg;

public class Map {
private int map;

public int getMap() {
	return map;
}

public void setMap(int map) {
	this.map = map;
}

}

class Mountain extends Map {
	public void mountain () {
		System.out.println("산이다.");
	}

}

class River extends Map{
	public void river () {
		System.out.println("이다.");
	}

}