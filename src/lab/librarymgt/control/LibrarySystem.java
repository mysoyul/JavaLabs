package lab.librarymgt.control;

import lab.librarymgt.entity.Borrowable;
import lab.librarymgt.entity.Downloadable;
import lab.librarymgt.entity.LibraryItem;
import lab.libraymgt.entity.book.Book;
import lab.libraymgt.entity.book.EBook;
import lab.libraymgt.entity.book.Magazine;

// 도서관 시스템 클래스
public class LibrarySystem {
    public static void main(String[] args) {
        // 객체 생성
        Book book1 = new Book("객체지향 프로그래밍", "B001", "홍길동", 350);
        Magazine magazine1 = new Magazine("코딩 월간지", "M001", "2025-04", "IT출판사");
        EBook ebook1 = new EBook("Java 완전정복", "E001", "PDF", 15.7);
        
        // 다형성 활용
        LibraryItem[] items = {book1, magazine1, ebook1};
        
        // 모든 자료 정보 출력
        System.out.println("===== 도서관 자료 목록 =====");
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println();
        }
        
        // 대출 및 반납 테스트
        book1.checkout();
        
        // 인터페이스 활용
        System.out.println("\n===== 대출 정보 =====");
        if (book1 instanceof Borrowable) {
            Borrowable borrowable = (Borrowable) book1;
            System.out.println("대출 기간: " + borrowable.getLoanPeriod() + "일");
            System.out.println("5일 연체 시 연체료: " + borrowable.calculateFine(5) + "원");
        }
        
        // Downloadable 인터페이스 테스트
        System.out.println("\n===== 전자책 다운로드 =====");
        if (ebook1 instanceof Downloadable) {
            Downloadable downloadable = (Downloadable) ebook1;
            downloadable.download();
        }
    }
}