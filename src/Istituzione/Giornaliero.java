package Istituzione;

public class Giornaliero extends Dipendente{
	
	private int days;
	
	public Giornaliero(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
		retribution=this.getBaseRetribution()*days;
	}
	
	public void gainPerson() {
		System.out.println("Dipendente giornaliero " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.getRetribution());
	}
	
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di:"+this.getRetribution());
		}
	
}
