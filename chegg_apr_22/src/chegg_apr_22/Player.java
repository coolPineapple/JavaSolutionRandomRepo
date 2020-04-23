package chegg_apr_22;


/*
 * Player class is implemented on user understanding of the scenario, because
 * there is no information provided how player class should be implemented.
 * This class needs to be implemented to ensure the working of the attack(int: damage) method present in monster Class
 * 
 */
public class Player{
	/* Instance variables */
	private String playerName;
	private int playerHealth;
	


	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getPlayerHealth() {
		return playerHealth;
	}



	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}



	public void takeDamage(int damage) {
		playerHealth = playerHealth - damage;
		
	}
	
}