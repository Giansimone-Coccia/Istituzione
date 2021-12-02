package Istituzione;

/**
 * Class' Giornaliero definition that extends the class Dipendente
 * @author gians_ji5genm
 *
 */
public class Giornaliero extends Dipendente{
	
	private int days;
	
	/**
	 * Constructor
	 * @param name person
	 * @param address person
	 * @param number person
	 * @param code person
	 * @param retribution person
	 */
	public Giornaliero(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
		retribution=this.getBaseRetribution()*days;
	}
	/**
	 * Method for showing person's dates
	 */
	public void gainPerson() {
		System.out.println("Dipendente giornaliero " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.getRetribution());
	}
	
	/**
	 * Method for calcolating the retrubution
	 */
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di:"+ this.getRetribution());
		}
	/**
	 * Method for setting the working days
	 * @param days
	 */
	public void setDays(int days) {
		this.days = days;
	}
	
}
