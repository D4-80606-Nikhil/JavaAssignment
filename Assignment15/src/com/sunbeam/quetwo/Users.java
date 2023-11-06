package com.sunbeam.quetwo;

public class Users {
  
  private int id;	
  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private String dob;
  
public Users(int id, String firstname, String lastname, String email, String password, String dob) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.dob = dob;
}

public final int getId() {
	return id;
}

public final void setId(int id) {
	this.id = id;
}

public final String getFirstname() {
	return firstname;
}

public final void setFirstname(String firstname) {
	this.firstname = firstname;
}

public final String getLastname() {
	return lastname;
}

public final void setLastname(String lastname) {
	this.lastname = lastname;
}

public final String getEmail() {
	return email;
}

public final void setEmail(String email) {
	this.email = email;
}

public final String getPassword() {
	return password;
}

public final void setPassword(String password) {
	this.password = password;
}

public final String getDob() {
	return dob;
}

public final void setDob(String dob) {
	this.dob = dob;
}

@Override
public String toString() {
	return "Users [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", password=" + password + ", dob=" + dob + "]";
}
  
   
  
}
