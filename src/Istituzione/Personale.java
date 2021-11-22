package Istituzione;
import java.util.Vector;

public abstract class Personale {
	
	private String name;
	private String address;
	private String number;
	
	public Personale(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public abstract void gainPerson();
	
	public abstract void calcolateRetribution();
	
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
