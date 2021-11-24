package Istituzione;

//Class' Impiegato definition that extends the class Dipendente
public class Impiegato extends Dipendente{
	
	private double bonus;
	
	//Constructor
	public Impiegato(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
		retribution=this.getBaseRetribution()+bonus;
	}
	
	public void gainPerson() {
		System.out.println("Dipendente impiegato " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.getRetribution());
	}
	
	//Method for calcolating the retribution
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di:"+this.getRetribution());
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
