package com.kh.pjh;

public class LibraryRun {
	public static void main(String[] args) {
		LibraryFunction lFunc = new LibraryFunction();
		//lFunc.makeUser();
		EXIT :
		while (true) {
			int choice = lFunc.printMenu();
			switch (choice) {
			case 1: // å ���
				lFunc.inputBook();
				break;
			case 2: // å ���� ���
				lFunc.printBook();
				break;
			case 3: // ����
				lFunc.rentBook();
				break;
			case 4: // �ݳ�
				lFunc.returnBook();
				break;
			case 5: // ����
				lFunc.printgoodBye();
				break EXIT;
			default: // ����
				lFunc.printException();
				break;
			}
		}
	}
}
