package swe2013.user;

import swe2013.location.Hotel;

public class Hotellier extends User{
	Hotel assignedHotel=null;

	/**
	 * Constructor
	 * @param username
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param telephoneNumber
	 * @param zipCode
	 * @param street
	 * @param city
	 * @param country
	 * @param sex
	 * @param password
	 */
	public Hotellier(String username, String firstName, String lastName, String email, String telephoneNumber, int zipCode, String street, String city, String country, boolean sex, String password) {
		super(username, firstName, lastName, email, telephoneNumber, zipCode, street, city, country, sex, password);
		// TODO Auto-generated constructor stub
	}

	public Hotellier(String username, String firstName, String lastName, String email, String telephoneNumber, int zipCode, String street, String city, String country, boolean sex, String password, Hotel assignedHotel) {
		super(username, firstName, lastName, email, telephoneNumber, zipCode, street, city, country, sex, password);
		this.assignedHotel = assignedHotel;
	}

	
	/**
	 * @return the assigned Hotel
	 */
	public final Hotel getAssignedHotel() {
		return assignedHotel;
	}


	/**
	 * @param assignedHotel set the assigned Hotel
	 */
	public final void setAssignedHotel(Hotel assignedHotel) {
		this.assignedHotel = assignedHotel;
	}
	
	public Integer getUserClass(){
		return 2;	
	}


}
