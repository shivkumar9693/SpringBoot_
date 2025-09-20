package com.springBoot.Test.Entity;

import java.awt.print.Book;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	@OneToOne
	@JsonBackReference
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
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
				+ Language + ", book=" + book + "]";
	}
	 
	public Author(int authorid, String firstname, String lastname, String language, Book book) {
		super();
		this.authorid = authorid;
		Firstname = firstname;
		Lastname = lastname;
		Language = language;
		this.book = book;
	}
	public Author() {
	 
	}
	 
}
