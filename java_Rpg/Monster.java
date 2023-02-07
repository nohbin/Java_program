package java_Rpg;

public class Monster {

	private String monster;

	public String getMonster() {
		return monster;
	}

	public void setMonster(String monster) {
		this.monster = monster;
	}

	public Monster(int health, int mana, int attackPower, int spellPower) {
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

}

class Goblin extends Monster {
	public Goblin(int health, int mana, int attackPower, int spellPower) {
		super(50, 0, 20, 0);
	}

}

class Dragon extends Monster {
	public Dragon(int health, int mana, int attackPower, int spellPower) {
		super(5000, 5000, 5000, 5000);
	}
}

class Slime extends Monster {
	public Slime(int health, int mana, int attackPower, int spellPower) {
		super(30, 30, 30, 30);
	}

}
