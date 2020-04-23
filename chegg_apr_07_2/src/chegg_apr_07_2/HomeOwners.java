package chegg_apr_07_2;

public class HomeOwners extends ResidencePolicy{
	private int homePropType;
	private int homeStructure;
	private int homeContents;
	private double homeDeductible;
	private boolean umbrella;
	public int getHomePropType() {
		return homePropType;
	}
	
	public void setHomePropType(int homePropType) {
		if(homePropType >= 1 && homePropType <= 4) {
		this.homePropType = homePropType;
		}
		System.exit(0);
	}
	
	public int getHomeStructure() {
		return homeStructure;
	}
	public void setHomeStructure(int homeStructure) {
		if(homeStructure > 10000) {
		this.homeStructure = homeStructure;
		}
		System.exit(0);
		
	}
	public int getHomeContents() {
		return homeContents;
	}
	public void setHomeContents(int homeContents) {
		if(homeContents > 10000) {
			this.homeContents = homeContents;
			}
			System.exit(0);
		
	}
	public double getHomeDeductible() {
		return homeDeductible;
	}
	public void setHomeDeductible(double homeDeductible) {
		
		this.homeDeductible = getHomeStructure() + getHomeContents();
	}
	public boolean isUmbrella() {
		return umbrella;
	}
	public void setUmbrella(boolean umbrella) {
		this.umbrella = umbrella;
	}

	@Override
	public double totalContractRisk() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
