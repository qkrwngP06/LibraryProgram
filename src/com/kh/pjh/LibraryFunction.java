package com.kh.pjh;

import java.util.Scanner;

public class LibraryFunction {
	Library[] books;

	public LibraryFunction() {
		books = new Library[5];
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 도서 관리 프로그램 ======");
		System.out.println("1.책 정보 등록");
		System.out.println("2.책 정보 출력");
		System.out.println("3.대출");
		System.out.println("4.반납");
		System.out.println("5.종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}

	// 책 정보 등록
	public void inputBook() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < books.length; i++) {
			System.out.println("======" + (i + 1) + "번째 책 정보 등록 ======");
			System.out.print("책 이름: ");
			String bookname = sc.next();
			System.out.print("저자: ");
			String author = sc.next();
			System.out.print("출판사: ");
			String publisher = sc.next();
			books[i] = new Library();
			books[i].setBookname(bookname);
			books[i].setAuthor(author);
			books[i].setPublisher(publisher);
		}
	}

	// 책 정보 출력
	public void printBook() {
		for (int i = 0; i < books.length; i++) {
			System.out.println("======책 정보 출력======");
			System.out.println("책 이름: " + books[i].getBookname() + " | 저자: " + books[i].getAuthor() + " | 출판사: "
					+ books[i].getPublisher());
		}
	}

	// 대출
	public void rentBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 대출 ======");
		System.out.print("대출자: ");
		String myname = sc.next();
		for (int i = 0; i < books.length; i++) {
			System.out.println("====== 책 정보 출력 ======");
			System.out.println("책 이름: " + books[i].getBookname() + " | 저자: " + books[i].getAuthor() + " | 출판사: "
					+ books[i].getPublisher());
		}
		System.out.println("============================");
		System.out.print("대출 할 책 이름: ");
		String bookname = sc.next();

		// 저자와 출판사는...어떻게 불러오는거지..?
		int bookNo = 0; // library에 대출 책 인덱스
		for (int i = 0; i < books.length; i++) {
			if (bookname.equals(books[i].getBookname())) { // 책 이름이 같으면
				bookNo = i; // library에 인덱스 저장
				break; // for문 종료
			}
		}
		// 이미 대출되어 있는 책인지 판별
		if (books[bookNo].getMyname() != null) {
			System.out.println("이미 대출되어 있는 책입니다.");
			return;
		}
		System.out.println("대출자: " + myname + " | 책 이름: " + bookname + " | 저자: " + books[bookNo].getAuthor()
				+ " | 출판사: " + books[bookNo].getPublisher());
		System.out.print("책을 대출하시겠습니까? [y/n] >> ");
		if (sc.next().equals("y")) {
			books[bookNo].setMyname(myname); // 해당 도서에 대한 Myname(대출자)를 세팅
			System.out.println(myname + "님, 대출되었습니다.");
		} else {
			System.out.println("취소되었습니다.");
		}
	}
	
	// 반납(아직 미완성)
	public void returnBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 반납 ======");
		// 대출자 이름 입력
		System.out.print("대출자: ");
		String myname = sc.next();
		// 대출자가 대출한 정보 출력(값을 받아와야함) -> 책이름, 저자, 출판사
		//다른 이름을 입력하면 대출정보가 없습니다. 
		boolean rented = false;
		for (int i = 0; i < books.length; i++) {
			if(myname.equals(books[i].getMyname())) {
				System.out.println("====== 책 정보 출력 ======");
				System.out.println("책 이름: " + books[i].getBookname() + " | 저자: " + books[i].getAuthor() + " | 출판사: "
						+ books[i].getPublisher());
				rented = true;
			}
		}
		if (rented == false) {
			System.out.println("대출정보가 없습니다.");
			return;
		}
		
		System.out.print("책을 반납하시겠습니까? [y/n] >> ");
		if (sc.next().equals("y")) {
			System.out.print("반납할 책 입력: ");
			String returnbook = sc.next();
			boolean mybook = false;
			for (int i = 0; i < books.length; i++) {
				if(returnbook.equals(books[i].getBookname()) && myname.equals(books[i].getMyname())) {
					books[i].setMyname(null);
					System.out.println("반납되었습니다.");
					mybook = true;
				}
			}
			if (mybook == false) {
				System.out.println("대출한 책이 아닙니다.");
				return;
			}
		} else {
			System.out.println("취소되었습니다.");
		}
	}

	// 마지막 종료
	public void printgoodBye() {
		System.out.println("안녕히가세요^^");
	}

	public void printException() {
		System.out.println("1 ~ 5 사이의 값을 입력해주세요..");
	}
}
