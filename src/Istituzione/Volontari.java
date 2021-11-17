package Istituzione;

public class Volontari extends Persona{
	
	public Volontari(String name, String address, String number) {
		super(name, address, number);
	}
	
	public void gainPerson() {
		System.out.println("Volontario" + this.getName() + "residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.calcolateRetribution());
	}
	
	public double calcolateRetribution() {
		return 0;
	}
	
}
