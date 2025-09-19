package com.springBoot.Test.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Author_Table")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorid;
	private String Firstname;
	private String Lastname;
	private String Language;
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Language="
				+ Language + "]";
	}
	public Author(int authorid, String firstname, String lastname, String language) {
		super();
		this.authorid = authorid;
		Firstname = firstname;
		Lastname = lastname;
		Language = language;
	}
	public Author() {
	 
	}
	 
}
