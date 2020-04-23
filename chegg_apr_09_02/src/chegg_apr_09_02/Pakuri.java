package chegg_apr_09_02;

public class Pakuri {
	// This Pakuri class is the meat of the Pakuri and how it is
	private String species;
	private int attack, defense, speed;

	
	public Pakuri(String species) {
		this.species = species;
		this.attack = ((species.length() * 7) + 9);
		this.defense = ((species.length() * 5) + 17);
		this.speed = ((species.length() * 6) + 13);
	}

	// Returns name of Pakuri
	public String getSpecies() {
		return this.species;
	}

	// Returns its attack
	public int getAttack() {
		return this.attack;
	}

	// Allows user to set the attack of Pakuri however they see fit
	public void setAttack(int newAttack) {
		this.attack = newAttack;
	}

	// Returns defense stat of Pakuri
	public int getDefense() {
		return this.defense;
	}

	// Returns the speed of Pakuri
	public int getSpeed() {
		return this.speed;
	}

	// When evolved, stats get jacked
	public void evolve() {
		this.attack = this.attack * 2;
		this.defense = this.defense * 4;
		this.speed = this.speed * 3;
	}
}