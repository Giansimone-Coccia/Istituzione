package Istituzione;

/**
 * Class' Volontari definition that extends the class Personale
 * @author gians_ji5genm
 *
 */
public class Volontari extends Personale{
	
	/**
	 * Constructor
	 * @param name volunteer
	 * @param address volunteer
	 * @param number volunteer
	 */
	public Volontari(String name, String address, String number) {
		super(name, address, number);
	}
	/**
	 * Method for showing a person
	 */
	public void gainPerson() {
		System.out.println("Volontario " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: 0");
	}
	
	/**
	 * Method for calcolating the retribution
	 */
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di: 0");
	}
	
}
