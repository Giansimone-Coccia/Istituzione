package Istituzione;
import java.util.Vector;
/**
 * Class Staff definition
 * @author gians_ji5genm
 *
 */
public class Staff {
	
	private Vector<Personale> people=new Vector<Personale>();
	private String nameIstitution;
	private String placeIstitution;
	
	/**
	 * Constructor
	 * @param nameIstitution
	 * @param placeIstitution
	 */
	public Staff(String nameIstitution,String placeIstitution) {
		this.nameIstitution=nameIstitution;
		this.placeIstitution=placeIstitution;
	}
	
	/**
	 * Method for adding a new person to the vector
	 * @param persona type Personale
	 */
	public void addPerson(Personale persona) {
		people.add(persona);
	}
	
	/**
	 * Method for printing all the Vector's people
	 */
	public void printPeople() {
		int i=0;
		System.out.println("Questo è il personale dell'istitutzione "+nameIstitution+" che risiede a "+placeIstitution);
		for(Personale p: people) {
			System.out.print((i++)+":");
			p.gainPerson();
		}
	}
	
	
	

}
