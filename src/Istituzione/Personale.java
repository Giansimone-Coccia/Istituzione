package Istituzione;
import java.util.Vector;

/**
 * Abstract class' Personale definition
 * @author gians_ji5genm
 *
 */
public abstract class Personale {
	
	private String name;
	private String address;
	private String number;
	
	/**
	 * Constructor
	 * @param name
	 * @param address
	 * @param number
	 */
	public Personale(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	/**
	 * Abstarct method
	 */
	public abstract void gainPerson();
	/**
	 * Abstrac method 
	 */
	public abstract void calcolateRetribution();
	
	/**
	 * Method for getting the name
	 * @return name person
	 */
	public String getName() {
		return name;
	}
	/**
	 * Method for getting peolple's address
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Method for getting peolple's phone number
	 * @return number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * Method for setting peolple's name
	 * @param nome
	 */
	public void setName(String nome) {
		this.name = nome;
	}
	/**
	 * Method for setting peolple's address
	 * @param via (address)
	 */
	public void setAddress(String via) {
		this.address = via;
	}
	/**
	 * Method for setting peolple's phone number
	 * @param num (number)
	 */
	public void setNumber(String num) {
		this.number = num;
	}
}
