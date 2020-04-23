package chegg_apr_22;

public class Monster {
	/* Instance variables */
	private String name;
	private int health;
	private int strength;
	private int xp;
	/**
	 * @param name
	 * @param health
	 * @param strength
	 * @param xp
	 */
	public Monster(String name, int health, int strength, int xp) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.xp = xp;
	}
	
	/* return monster object of given monsterName */
	public static Monster spawn(String monsterName) {
		if(monsterName == "goblin") {
			return new Monster("goblin", 60, 8, 1);
		}
		if(monsterName == "orc") {
			return new Monster("orc", 100, 12, 3);
		}
		return new Monster("troll", 150, 15, 5);
	}
	
	/* getter to return name of the monster */
	public String getName() {
		return name;
	}
	/* getter to return health of the monster */
	public int getHealth() {
		return health;
	}
	/* getter to return strength of the monster */
	public int getStrength() {
		return strength;
	}
	/* getter to return the XP of the monster */
	public int getXp() {
		return xp;
	}
	/* this method decreases the health by given damage points, this method also
	 * checks that damage should not be negative */
	public void takeDamage(int damage) {
		if(damage > 0){
		health = health - damage;
		}
	}

	@Override
	public String toString() {
		return String.format("[%s] HP: %d. STR: %d",name, health, strength);
	}
	
	
	/* this method implements the functionality of attack(int damage) method,
	 * monster attacks player, where player takes damage equal to monster strength */
	public void attack(Player hero) {
	hero.takeDamage(this.strength);
	System.out.println(String.format("%s attacks player for %d damage", name, strength));
		
	}
	
	
	
}
