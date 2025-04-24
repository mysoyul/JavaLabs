package lab.libraymgt.entity.book;

import lab.librarymgt.entity.Borrowable;
import lab.librarymgt.entity.LibraryItem;

// Book 클래스
public class Book extends LibraryItem implements Borrowable {
    private String author;
    private int pages;
    
    public Book(String title, String id, String author, int pages) {
        super(title, id);
        this.author = author;
        this.pages = pages;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("책 정보: " + title + " (ID: " + id + ")");
        System.out.println("저자: " + author + ", 페이지: " + pages);
        System.out.println("대출 상태: " + (checkedOut ? "대출 중" : "대출 가능"));
    }
    
    @Override
    public int getLoanPeriod() {
        return 14; // 2주 대출 기간
    }
    
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 500.0; // 하루 500원 연체료
    }
}