package Istituzione;

public abstract class Dipendente extends Personale{
	
	private String code;
	private double retribution;
	private double baseRetribution;
	
	public Dipendente(String name, String address, String number, String code, double baseRetribution) {
		super(name, address, number);
		
		this.code = code;
		this.baseRetribution = baseRetribution;
	}
	
	public abstract void gainPerson();
	
	public double getRetribution() {
		return retribution;
	}
	
	public double getBaseRetribution() {
		return baseRetribution;
	}
	
	public abstract void calcolateRetribution();
}
