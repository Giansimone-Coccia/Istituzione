package Istituzione;

//Class' Giornaliero definition that extends the class Dipendente
public class Giornaliero extends Dipendente{
	
	private int days;
	
	//Constructor
	public Giornaliero(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
		retribution=this.getBaseRetribution()*days;
	}
	
	public void gainPerson() {
		System.out.println("Dipendente giornaliero " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.getRetribution());
	}
	
	//Method for calcolating the retrubution
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale � di:"+ this.getRetribution());
		}
	
	public void setDays(int days) {
		this.days = days;
	}
	
}
