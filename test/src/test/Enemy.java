package test;

public class Enemy extends Person{
	public Enemy(String name, int health) {
		super(name, health);
	}

	
	void learnSpell(Spell spell) {
		if( spell.getEvilness() >= 7) {
			super.learnSpell(spell);
		}
		
	}
	
	@Override
	void attack(Person person, Spell spell) {
		if(person instanceof Enemy == false) {
			super.health = super.health - spell.getPower();
			super.attack(person, spell);
		}
		
	}
	// overloading
	void attack(Person person) {
		if(person instanceof Enemy == false) {
			super.health = super.health - person.spells[0].getPower();
		}
		if(person instanceof Enemy == true ) {
			if(person.getSpells().length == 0) {
				System.out.println(person.getName()+" has't learned any spells");
			}
			if(person.getHealth() <= 0) {
				if( person instanceof Hero) {
					currentlyBattlingHeroes = currentlyBattlingHeroes - 1;
					numPeople = numPeople - 1;
					
				}
			}
			
		}
	}

}
