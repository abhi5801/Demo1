package com.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "EmployeeData")  // to change the name of table into database
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullname;
	@Column(name = "user")
	private String username;
	@Column(name = "pass")
	private String password;
	private int age;
	private double salary;
	
	@Lob  //datatype of mysql database
	@Column(length = 999999999)
	private byte[] pancard;
	
	@Lob
	@Column(length = 999999999)
	private byte[] aadharcard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(byte[] aadharcard) {
		this.aadharcard = aadharcard;
	}
	
//	{
//		"fullname":"pratik mane",
//		"username":"pratik@gmail.com",
//		 "password":"pass@123",
//		 "age":25,
//		 "salary":1000
//   }
	
	
	
	
	
	
	
	
	
	
	
	

}
