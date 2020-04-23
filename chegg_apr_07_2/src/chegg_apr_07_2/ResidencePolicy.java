package chegg_apr_07_2;

public abstract class ResidencePolicy {
	private String owner;
	private String group;
	private int number;
	private String address;
	private double premium;
	
	
	/**
	 * 
	 */
	public ResidencePolicy() {
		super();
	}


	/**
	 * @param owner
	 * @param group
	 * @param number
	 * @param address
	 * @param premium
	 */
	public ResidencePolicy(String own, String grp, int nbr, String addr, double prem) {
		super();
		this.owner = own;
		this.group = grp;
		this.number = nbr;
		this.address = addr;
		this.premium = prem;
	}
	
	public double riskpremRatio() {
		return premium/totalContractRisk();
		
	}
	public abstract double totalContractRisk();


	@Override
	public String toString() {
		return owner+" owns "+getClass().getSimpleName()+" "+number+", issued by "+group+", at physical address "+address+", for a premium of "+String.format("%,d", premium)+".";
	}
	
	
	
	
}
