package Istituzione;

public class Impiegato extends Dipendente{
	
	private double bonus;
	
	public Impiegato(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
		retribution=this.getBaseRetribution()+bonus;
	}
	
	public void gainPerson() {
		System.out.println("Dipendente impiegato " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.getAddress());
	}
	
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di:"+this.getRetribution());;
	}
	
}
