package lab.libraymgt.entity.book;

import lab.librarymgt.entity.Downloadable;
import lab.librarymgt.entity.LibraryItem;

// EBook 클래스
public class EBook extends LibraryItem implements Downloadable {
    private String format;
    private double fileSize;
    
    public EBook(String title, String id, String format, double fileSize) {
        super(title, id);
        this.format = format;
        this.fileSize = fileSize;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("전자책 정보: " + title + " (ID: " + id + ")");
        System.out.println("형식: " + format + ", 파일 크기: " + fileSize + "MB");
        System.out.println("대출 상태: " + (checkedOut ? "대출 중" : "대출 가능"));
    }
    
    @Override
    public void download() {
        System.out.println(title + " 전자책을 다운로드합니다. 파일 형식: " + format);
    }
}