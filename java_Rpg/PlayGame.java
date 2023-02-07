package java_Rpg;

import java.util.Scanner;

public class PlayGame {
	
	public PlayGame() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJob() {
		return job;
	}
	public void setJob(int job) {
		this.job = job;
	}

	Scanner sc = new Scanner(System.in);
	private int job;
	private String name;



	  public PlayGame(int health, int mana, int attackPower, int spellPower) {
		    this.health = health;
		    this.mana = mana;
		    this.attackPower = attackPower;
		    this.spellPower = spellPower;
		  }

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getSpellPower() {
		return spellPower;
	}
	public void setSpellPower(int spellPower) {
		this.spellPower = spellPower;
	}

	private int health;
	private int mana;
	private int attackPower;
	private int spellPower;
	
	  public void attack(Monster monster) {
		    System.out.println("몬스터를 공격했다! " + this.attackPower + " damage!");
		    monster.setHealth(monster.getHealth() - this.attackPower);
		  }

}

class Warrior extends PlayGame {
	  public Warrior() {
		    super(100, 0, 30, 50);
		  }
	  
	  public void Attack() {
		  
	  }
	
}

class Mage extends PlayGame {
	public Mage() {
		super(80,100,20,50);
		}
}
