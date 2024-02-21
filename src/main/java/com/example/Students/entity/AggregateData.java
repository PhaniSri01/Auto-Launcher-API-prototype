package com.example.Students.entity;

import org.springframework.stereotype.Component;

import io.swagger.v3.oas.annotations.media.Schema;

@Component
public class AggregateData {

	@Schema(description = "user", name ="person", type = "Person")
	private Person person;
	
	@Schema(description = "marks", name ="marks", type = "Marks")
	private Marks marks;
	
	@Schema(description = "object", name ="object", type = "Object")
	private Object object;
	
	public AggregateData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AggregateData(Person person, Marks marks, Object object) {
		super();
		this.person = person;
		this.marks = marks;
		this.object = object;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Marks getMarks() {
		return marks;
	}
	
	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
