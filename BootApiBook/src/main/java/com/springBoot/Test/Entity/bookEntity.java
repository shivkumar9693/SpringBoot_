package com.springBoot.Test.Entity;

public class bookEntity {
	private int bookid;
	private String bookname;
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
	public bookEntity() {
		 
	}
	public bookEntity(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "bookEntity [bookid=" + bookid + ", bookname=" + bookname + "]";
	}
	
	

}
