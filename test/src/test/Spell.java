package test;

public class Spell {
	private String name;
	private int power;
	private double evilness;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public double getEvilness() {
		return evilness;
	}
	public void setEvilness(double evilness) {
		this.evilness = evilness;
	}
	public Spell(String name, int power, double evilness) {
		super();
		this.name = name;
		this.power = power;
		this.evilness = evilness;
	}
	
}
