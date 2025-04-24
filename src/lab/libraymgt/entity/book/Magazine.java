package lab.libraymgt.entity.book;

import lab.librarymgt.entity.Borrowable;
import lab.librarymgt.entity.LibraryItem;

// Magazine 클래스
public class Magazine extends LibraryItem implements Borrowable {
    private String issueDate;
    private String publisher;
    
    public Magazine(String title, String id, String issueDate, String publisher) {
        super(title, id);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("잡지 정보: " + title + " (ID: " + id + ")");
        System.out.println("발행일: " + issueDate + ", 출판사: " + publisher);
        System.out.println("대출 상태: " + (checkedOut ? "대출 중" : "대출 가능"));
    }
    
    @Override
    public int getLoanPeriod() {
        return 7; // 1주 대출 기간
    }
    
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 1000.0; // 하루 1000원 연체료
    }
}