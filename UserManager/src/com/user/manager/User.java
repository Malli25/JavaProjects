package com.user.manager;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8568767845510234633L;
	private int id;
	private String Name;
	private int Age;
	private String Designation;
	
	
	public User() {
		super();
	}

	

	public User(int id, String name, int age, String designation) {
		super();
		this.id = id;
		Name = name;
		Age = age;
		Designation = designation;
	}



	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}

	@XmlElement
	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}

	@XmlElement
	public void setAge(int age) {
		Age = age;
	}


	public String getDesignation() {
		return Designation;
	}

	@XmlElement
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	
	
	

}
