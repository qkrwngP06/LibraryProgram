package com.kh.pjh;

import java.util.Scanner;

public class LibraryFunction {
	Library[] books;

	public LibraryFunction() {
		books = new Library[5];
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ���� ���� ���α׷� ======");
		System.out.println("1.å ���� ���");
		System.out.println("2.å ���� ���");
		System.out.println("3.����");
		System.out.println("4.�ݳ�");
		System.out.println("5.����");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		return menu;
	}

	// å ���� ���
	public void inputBook() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < books.length; i++) {
			System.out.println("======" + (i + 1) + "��° å ���� ��� ======");
			System.out.print("å �̸�: ");
			String bookname = sc.next();
			System.out.print("����: ");
			String author = sc.next();
			System.out.print("���ǻ�: ");
			String publisher = sc.next();
			books[i] = new Library();
			books[i].setBookname(bookname);
			books[i].setAuthor(author);
			books[i].setPublisher(publisher);
		}
	}

	// å ���� ���
	public void printBook() {
		for (int i = 0; i < books.length; i++) {
			System.out.println("======å ���� ���======");
			System.out.println("å �̸�: " + books[i].getBookname() + " | ����: " + books[i].getAuthor() + " | ���ǻ�: "
					+ books[i].getPublisher());
		}
	}

	// ����
	public void rentBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ���� ======");
		System.out.print("������: ");
		String myname = sc.next();
		for (int i = 0; i < books.length; i++) {
			System.out.println("====== å ���� ��� ======");
			System.out.println("å �̸�: " + books[i].getBookname() + " | ����: " + books[i].getAuthor() + " | ���ǻ�: "
					+ books[i].getPublisher());
		}
		System.out.println("============================");
		System.out.print("���� �� å �̸�: ");
		String bookname = sc.next();

		// ���ڿ� ���ǻ��...��� �ҷ����°���..?
		int bookNo = 0; // library�� ���� å �ε���
		for (int i = 0; i < books.length; i++) {
			if (bookname.equals(books[i].getBookname())) { // å �̸��� ������
				bookNo = i; // library�� �ε��� ����
				break; // for�� ����
			}
		}
		// �̹� ����Ǿ� �ִ� å���� �Ǻ�
		if (books[bookNo].getMyname() != null) {
			System.out.println("�̹� ����Ǿ� �ִ� å�Դϴ�.");
			return;
		}
		System.out.println("������: " + myname + " | å �̸�: " + bookname + " | ����: " + books[bookNo].getAuthor()
				+ " | ���ǻ�: " + books[bookNo].getPublisher());
		System.out.print("å�� �����Ͻðڽ��ϱ�? [y/n] >> ");
		if (sc.next().equals("y")) {
			books[bookNo].setMyname(myname); // �ش� ������ ���� Myname(������)�� ����
			System.out.println(myname + "��, ����Ǿ����ϴ�.");
		} else {
			System.out.println("��ҵǾ����ϴ�.");
		}
	}
	
	// �ݳ�(���� �̿ϼ�)
	public void returnBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �ݳ� ======");
		// ������ �̸� �Է�
		System.out.print("������: ");
		String myname = sc.next();
		// �����ڰ� ������ ���� ���(���� �޾ƿ;���) -> å�̸�, ����, ���ǻ�
		//�ٸ� �̸��� �Է��ϸ� ���������� �����ϴ�. 
		boolean rented = false;
		for (int i = 0; i < books.length; i++) {
			if(myname.equals(books[i].getMyname())) {
				System.out.println("====== å ���� ��� ======");
				System.out.println("å �̸�: " + books[i].getBookname() + " | ����: " + books[i].getAuthor() + " | ���ǻ�: "
						+ books[i].getPublisher());
				rented = true;
			}
		}
		if (rented == false) {
			System.out.println("���������� �����ϴ�.");
			return;
		}
		
		System.out.print("å�� �ݳ��Ͻðڽ��ϱ�? [y/n] >> ");
		if (sc.next().equals("y")) {
			System.out.print("�ݳ��� å �Է�: ");
			String returnbook = sc.next();
			boolean mybook = false;
			for (int i = 0; i < books.length; i++) {
				if(returnbook.equals(books[i].getBookname()) && myname.equals(books[i].getMyname())) {
					books[i].setMyname(null);
					System.out.println("�ݳ��Ǿ����ϴ�.");
					mybook = true;
				}
			}
			if (mybook == false) {
				System.out.println("������ å�� �ƴմϴ�.");
				return;
			}
		} else {
			System.out.println("��ҵǾ����ϴ�.");
		}
	}

	// ������ ����
	public void printgoodBye() {
		System.out.println("�ȳ���������^^");
	}

	public void printException() {
		System.out.println("1 ~ 5 ������ ���� �Է����ּ���..");
	}
}
