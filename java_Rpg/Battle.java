package java_Rpg;

import java.util.Random;

public class Battle extends PlayGame {

	private PlayGame warrior;
	  private Monster monster;

	  public Battle(PlayGame warrior) {
	    this.warrior = warrior;
	    this.monster = getRandomMonster();
	  }

	  private Monster getRandomMonster() {
	    Random random = new Random();
	    int rand = random.nextInt(3);
	    if (rand == 0) {
	      return new Goblin(0, 0, 0, 0);
	    } else if (rand == 1) {
	      return new Dragon(0, 0, 0, 0);
	    } else {
	      return new Slime(0, 0, 0, 0);
	    }
	  }

	  public void start() {
	    System.out.println(monster.getClass().getSimpleName() + " 나타났다!");
	    while (warrior.getHealth() > 0 && monster.getHealth() > 0) {
	      warrior.attack(monster);
	      if (monster.getHealth() <= 0) {
	        System.out.println("승리.");
	        break;
	      }
	      System.out.println("몬스터의 공격" + monster.getAttackPower() + "!");
	      warrior.setHealth(warrior.getHealth() - monster.getAttackPower());
	      if (warrior.getHealth() <= 0) {
	        System.out.println("패배. GAMEOVER");
	        break;
	      }
	    }
	  }
	}
