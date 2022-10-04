/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Java Program to Illustrate Record Class

package College;

// Class
public class Record {

	// Instance variables
	private String name;
	private int idNumber;
	private int contactNumber;

	// Default Constructor
	public Record() {}

	// Parameterized Constructor
	// @param name
	// @param idNumber
	// @param contactNumber
	public Record(String name, int idNumber,
				int contactNumber)
	{

		// this keyword refers to current instance itself
		this.name = name;
		this.idNumber = idNumber;
		this.contactNumber = contactNumber;
	}

	// Getting the value of contactNumber
	// @return the value of contactNumber
	public int getContactNumber() { return contactNumber; }

	// Set the value of contactNumber
	// @param contactNumber new value of contactNumber
	public void setContactNumber(int contactNumber)
	{

		this.contactNumber = contactNumber;
	}

	// Getting the value of idNumber
	// @return the value of idNumber
	public int getIdNumber() { return idNumber; }

	// Setting the value of idNumber
	// @param idNumber new value of idNumber
	public void setIdNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}

	// Getting the value of name
	// @return the value of name
	public String getName() { return name; }

	// Setting the value of name
	// @param name new value of name
	public void setName(String name) { this.name = name; }

	// toString() Method
	// @return
	@Override public String toString()
	{

		// Returning the record
		return "Records{"
			+ "name=" + name + ", idNumber=" + idNumber
			+ ", contactNumber=" + contactNumber + '}';
	}
}
