package com.springBoot.Test.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookDetails")
public class bookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bookname;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author author;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public bookEntity(int bookid, String bookname, Author author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "bookEntity [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + "]";
	}
	public bookEntity() {
	 
	}
	 
 
	
	

}
