package prodapp_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {
	
private String firstName;
private String lastName;
@Id
private String email;
private String password;

public SignUp() {
	super();
	// TODO Auto-generated constructor stub
}

public SignUp(String firstName, String lastName, String email, String password) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "SignUp [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
			+ "]";
}

}
