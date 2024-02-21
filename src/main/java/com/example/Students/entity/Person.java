package com.example.Students.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;


@Entity
@Table(name = "person")
public class Person {

	@Column(name = "name")
	@Schema(description = "name of the user", name ="name", type = "string", example ="Ram")
	private String name;
	
	@Id
	@Column(name = "rollno")
	@Schema(description = "roll no of the user", name ="roll", type = "long", example ="01")
	private Long roll;
	
	@Column(name = "address")
	@Schema(description = "address of the user", name ="address", type = "string", example ="Hyderabad")
	private String address;
	
	public Person() {
		super();
	}

	public Person(String name, Long roll, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRoll() {
		return roll;
	}

	public void setRoll(Long roll) {
		this.roll = roll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
