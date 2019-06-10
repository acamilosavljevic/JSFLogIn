package rs.cubes.JSFLogIn.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class UserBean implements Serializable{
	
	private Random r = new Random();
	
	private String firstName = super.toString() + "";
	private String lastName = "";
	private Date dob;
	private String sex;
	private String email;
	private String servicelevel = "medium";
	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServicelevel() {
		return servicelevel;
	}
	public void setServicelevel(String servicelevel) {
		this.servicelevel = servicelevel;
	}
	public String beanAction() {
		
		System.out.println(this.toString());
		this.clear();
		return "register?faces-redirect=true";
	}
	
	private void clear() {
		this.firstName="";
		this.lastName = "";
		this.dob = null;
		this.sex = "";
		this.email = "";
		this.servicelevel = "medium";
	}
	
	@Override
	public String toString() {
		return "UserBean [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", sex=" + sex
				+ ", email=" + email + ", servicelevel=" + servicelevel + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getDob()=" + getDob() + ", getSex()=" + getSex()
				+ ", getEmail()=" + getEmail() + ", getServicelevel()=" + getServicelevel() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
