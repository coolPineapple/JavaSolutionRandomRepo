package chegg_apr_22;

public class MonsterTester {
	
	public static void main(String[] args) {
		Monster goblin = Monster.spawn("goblin");
		Monster orc = Monster.spawn("orc");
		Monster troll = Monster.spawn("troll");
		
		System.out.println(goblin);
		System.out.println(orc);
		System.out.println(troll);
	}
}
