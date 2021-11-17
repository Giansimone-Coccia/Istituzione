package Istituzione;

public class Dipendenti extends Persona{
	
	private String code;
	private static double retribution;
	
	public Dipendenti(String name, String address, String number, String code, double retribution) {
		super(name, address, number);
		
		this.code = code;
		this.retribution = retribution;
	}
	
	public void gainPerson() {
		System.out.println("Dipendente" + this.getName() + "residente in " + this.getAddress());
		System.out.println("retribuzione pari a: " + this.calcolateRetribution());
	}
	
	public double calcolateRetribution() {
		return this.retribution;
	}
	
	public double getRetribution() {
		return retribution;
	}
	
}
