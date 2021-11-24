package Istituzione;

//Class' Volontari definition that extends the class Personale
public class Volontari extends Personale{
	
	//Constructor
	public Volontari(String name, String address, String number) {
		super(name, address, number);
	}
	
	public void gainPerson() {
		System.out.println("Volontario " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: 0");
	}
	
	//Method for calcolating the retribution
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di: 0");
	}
	
}
