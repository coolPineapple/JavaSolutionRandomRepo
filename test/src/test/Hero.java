package test;

public class Hero extends Person{
	


public void learnSpell(Spell spell) {
	if(spell.getEvilness() < 7 ) {
		super.learnSpell(spell);
	}
}
@Override
	void attack(Person person, Spell spell) {
	if(person instanceof Hero == false) {
		super.health = super.health - spell.getPower();
	}
	if( person instanceof Hero) {
		currentlyBattlingHeroes = currentlyBattlingHeroes - 1;
		numPeople = numPeople - 1;
		
	}
	
}

	void attack(Person person) {
	if(person instanceof Hero == false) {
		super.health = super.health - person.spells[0].getPower();
	}
}

public Hero(String name, int health) {
	super(name, health);
	
}

}
