package Istituzione;

/**
 * Abstract class' "Dipendente" definition that extends the
 * other abstract class Personale
 * @author gians_ji5genm
 *
 */
public abstract class Dipendente extends Personale{
	
	private String code;
	private double retribution;
	private double baseRetribution;
	
	/**
	 * Constructor
	 * @param name
	 * @param address
	 * @param number
	 * @param code
	 * @param baseRetribution
	 */
	public Dipendente(String name, String address, String number, String code, double baseRetribution) {
		super(name, address, number);
		
		this.code = code;
		this.baseRetribution = baseRetribution;
	}
	
	/**
	 * Abstract method
	 */
	public abstract void gainPerson();
	
	/**
	 * Method for getting the retribution
	 * @return
	 */
	public double getRetribution() {
		return retribution;
	}
	/**
	 * Method for getting the base retribution
	 * @return
	 */
	public double getBaseRetribution() {
		return baseRetribution;
	}
	
	/**
	 * Abstract method for calcolating the retribution
	 */
	public abstract void calcolateRetribution();
}
