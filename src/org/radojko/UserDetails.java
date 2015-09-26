package org.radojko;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id //saying to hibernate that this will be primary key
	private int userID;
	private String firstName;
	private String lastName;
	private Date registrationDate;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
	
}
