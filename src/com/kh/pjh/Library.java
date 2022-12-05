package com.kh.pjh;

public class Library {
	public String bookname; //책이름
	public String author;  //작가
	public String publisher;  //출판사
	private String myname;  //대출자
	
	public Library(){}
	
	public Library(String bookname) {
		this.bookname = bookname;
	}
	
	public Library(String bookname, String author, String publisher) {
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
	}
	
	public Library(String bookname, String author, String publisher, String myname) {
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
		this.myname = myname;
	}
	
	//getter 메소드
	public String getBookname() {
		return this.bookname;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public String getMyname() {
		return this.myname;
	}
	
	//setter 메소드
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}

}
