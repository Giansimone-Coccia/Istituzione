package Istituzione;

public class Giornaliero extends Dipendenti{
	
	private int days;
	
	public Giornaliero(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
	}
	
	public void gainPerson() {
		System.out.println("Giornaliero" + this.getName() + "residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.calcolateRetribution());
	}
	
	public double calcolateRetribution() {
		return this.getRetribution()*days;
	}
	
}
