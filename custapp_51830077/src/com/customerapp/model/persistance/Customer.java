package com.customerapp.model.persistance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="customerapp")
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	@NotEmpty(message="firstName cannot be left blank")
	private String firstName;
	@NotEmpty(message="lastname cannot be left blank")
	private String lastName;
	@NotEmpty(message="address cannot be left blank")
	private String address;
	@NotEmpty(message="mobile cannot be left blank")
	private String mobile;
	@Email
	@NotEmpty(message="email cannot be left blank")
	private String email;
	@NotNull(message="salary cannot be left blank")
	private Double salary;
	@Past
	@NotNull(message="DOB cannot be left blank")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, String address, String mobile, String email, Double salary,
			Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
