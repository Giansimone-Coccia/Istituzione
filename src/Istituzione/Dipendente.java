package Istituzione;

/*Abstract class' "Dipendente" definition that extends the
 * other abstract class Personale
 */
public abstract class Dipendente extends Personale{
	
	private String code;
	private double retribution;
	private double baseRetribution;
	
	//Constructor
	public Dipendente(String name, String address, String number, String code, double baseRetribution) {
		super(name, address, number);
		
		this.code = code;
		this.baseRetribution = baseRetribution;
	}
	
	//Abstract method
	public abstract void gainPerson();
	
	//Get and set methods
	public double getRetribution() {
		return retribution;
	}
	
	public double getBaseRetribution() {
		return baseRetribution;
	}
	
	//Abstract method for calcolating the retribution
	public abstract void calcolateRetribution();
}
