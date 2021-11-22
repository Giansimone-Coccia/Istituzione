package Istituzione;
import java.util.Vector;

public class Staff {
	
	private Vector<Personale> people=new Vector<Personale>();
	private String nameIstitution;
	private String placeIstitution;
	
	public Staff(String nameIstitution,String placeIstitution) {
		this.nameIstitution=nameIstitution;
		this.placeIstitution=placeIstitution;
	}
	
	public void addPerson(Personale persona) {
		people.add(persona);
	}
	
	public void printPeople() {
		int i=0;
		System.out.println("Questo è il personale dell'istitutzione "+nameIstitution+" che risiede a "+placeIstitution);
		for(Personale p: people) {
			System.out.print((i++)+":");
			p.gainPerson();
		}
	}
	
	
	

}
