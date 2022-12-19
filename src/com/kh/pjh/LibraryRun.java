package com.kh.pjh;

public class LibraryRun {
	public static void main(String[] args) {
		LibraryFunction lFunc = new LibraryFunction();
		//lFunc.makeUser();
		EXIT :
		while (true) {
			int choice = lFunc.printMenu();
			switch (choice) {
			case 1: // 책 등록
				lFunc.inputBook();
				break;
			case 2: // 책 정보 출력
				lFunc.printBook();
				break;
			case 3: // 대출
				lFunc.rentBook();
				break;
			case 4: // 반납
				lFunc.returnBook();
				break;
			case 5: // 종료
				lFunc.printgoodBye();
				break EXIT;
			default: // 예외
				lFunc.printException();
				break;
			}
		}
	}
}
