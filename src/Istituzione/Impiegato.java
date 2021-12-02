package Istituzione;

/**
 * Class' Impiegato definition that extends the class Dipendente
 * @author gians_ji5genm
 *
 */
public class Impiegato extends Dipendente{
	
	private double bonus;
	
	/**
	 * Constructor
	 * @param name
	 * @param address
	 * @param number
	 * @param code
	 * @param retribution
	 */
	public Impiegato(String name, String address, String number, String code, double retribution) {
		super(name, address, number, code, retribution);
		retribution=this.getBaseRetribution()+bonus;
	}
	/**
	 * Method for showing person's dates
	 */
	public void gainPerson() {
		System.out.println("Dipendente impiegato " + this.getName() + " residente in " + this.getAddress());
		System.out.println("con retribuzione pari a: " + this.getRetribution());
	}
	
	/**
	 * Method for calcolating the retribution
	 */
	public void calcolateRetribution() {
		System.out.println("La retribuzione totale è di:"+this.getRetribution());
	}
	/**
	 * Method for calcolating the bonus
	 * @param bonus
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
