package Istituzione;

public class Volontari extends Personale{
	
	public Volontari(String name, String address, String number) {
		super(name, address, number);
	}
	
	public void gainPerson() {
		System.out.println("Volontario " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: 0");
	}
	
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di: 0");
	}
	
}
