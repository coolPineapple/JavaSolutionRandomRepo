package test;

public class Person {
 protected String name;
 protected int health;
 protected Spell[] spells;
 protected static int numPeople;
 protected static int currentlyBattlingEnemies;
 protected static int currentlyBattlingHeroes;

 // attack method 
 
 void attack(Person person, Spell spell) {
	if(this.health <= 0 ) {
		System.out.println("Cannot Attack, You are dead!");
	}
	
	if(person.health <= 0) {
		System.out.println("You can't attack "+person.name+" ! Thay are already dead!");
	}
	// to check if a particular spell is present in Spell[] of the person
	
	boolean isspellContainedInSpells=false;
	for(int i =0;i< this.spells.length;i++) {
		if(this.spells[i].equals(spell.getName())) {
			isspellContainedInSpells=true;
			
		}
		if(isspellContainedInSpells == false) {
			System.out.println("Cannot attck. You Have't learned the spell");
			this.health =this.health - spell.getPower();
		}
		
		// reduce the number of battling enemies if power of person becomes less than or equals to 0
		
		if(this.health <= 0) {
			if( person instanceof Hero) {
				currentlyBattlingEnemies = currentlyBattlingEnemies - 1;
				numPeople = numPeople - 1;
				
			}
		}
	}
	
}
// method to check who is winning
 
static String whoIsWinning() {
	if(currentlyBattlingHeroes > currentlyBattlingEnemies) {
		return "The heroes are currently winning!";
	}
	if(currentlyBattlingHeroes < currentlyBattlingEnemies) {
		return "The enemies are currently winning!";
	}
	return "it's currently a tie!";
	
}
// method to add spells to Spell[] list of person
void learnSpell(Spell spell) {
	int sizeOfSpell = this.spells.length;
	if(sizeOfSpell >5) {
		System.out.println("Cannot learn more spells");
	}
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}

public Spell[] getSpells() {
	return spells;
}

public void setSpells(Spell[] spells) {
	this.spells = spells;
}

public static int getNumPeople() {
	return numPeople;
}

public static void setNumPeople(int numPeople) {
	Person.numPeople = numPeople;
}

public static int getCurrentlyBattlingEnemies() {
	return currentlyBattlingEnemies;
}

public static void setCurrentlyBattlingEnemies(int currentlyBattlingEnemies) {
	Person.currentlyBattlingEnemies = currentlyBattlingEnemies;
}

public static int getCurrentlyBattlingHeroes() {
	return currentlyBattlingHeroes;
}

public static void setCurrentlyBattlingHeroes(int currentlyBattlingHeroes) {
	Person.currentlyBattlingHeroes = currentlyBattlingHeroes;
}

public Person(String name, int health) {
	super();
	this.name = name;
	this.health = health;
}

	

}
