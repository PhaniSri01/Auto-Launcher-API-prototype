package com.example.Students.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class Marks {

	@Id
	@Column(name = "rollno")
	private Long roll;
	
	@Column(name = "telugu")
	private Long telugu;
	
	@Column(name = "hindi")
	private Long hindi;
	
	@Column(name = "english")
	private Long english;
	
	@Column(name = "maths")
	private Long maths;
	
	@Column(name = "science")
	private Long science;
	
	@Column(name = "social")
	private Long social;

	public Marks() {
		super();
	}

	public Marks(Long roll, Long telugu, Long hindi, Long english, Long maths, Long science, Long social) {
		super();
		this.roll = roll;
		this.telugu = telugu;
		this.hindi = hindi;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}

	public Long getRoll() {
		return roll;
	}

	public void setRoll(Long roll) {
		this.roll = roll;
	}

	public Long getTelugu() {
		return telugu;
	}

	public void setTelugu(Long telugu) {
		this.telugu = telugu;
	}

	public Long getHindi() {
		return hindi;
	}

	public void setHindi(Long hindi) {
		this.hindi = hindi;
	}

	public Long getEnglish() {
		return english;
	}

	public void setEnglish(Long english) {
		this.english = english;
	}

	public Long getMaths() {
		return maths;
	}

	public void setMaths(Long maths) {
		this.maths = maths;
	}

	public Long getScience() {
		return science;
	}

	public void setScience(Long science) {
		this.science = science;
	}

	public Long getSocial() {
		return social;
	}

	public void setSocial(Long social) {
		this.social = social;
	}	
	
}
