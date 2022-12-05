package com.kh.pjh;

public class Library {
	public String bookname; //å�̸�
	public String author;  //�۰�
	public String publisher;  //���ǻ�
	private String myname;  //������
	
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
	
	//getter �޼ҵ�
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
	
	//setter �޼ҵ�
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
