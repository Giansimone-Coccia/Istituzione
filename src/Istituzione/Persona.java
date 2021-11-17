package Istituzione;
import java.util.Vector;

public abstract class Persona {
	
	private String name;
	private String address;
	private String number;
	
	protected static Vector<Persona> persone;
	
	public Persona(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
		persone = new Vector<Persona>();
	}
	
	public abstract void gainPerson();
	
	public abstract double calcolateRetribution();
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNumber() {
		return number;
	}
}
