package Istituzione;

public class Impiegato extends Dipendenti{
	
	private double bonus;
	
	public Impiegato(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
	}
	
	public void gainPerson() {
		System.out.println("Impiegato" + this.getName() + "residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.calcolateRetribution());
	}
	
	public double calcolateRetribution() {
		return this.getRetribution()*bonus;
	}
	
}
