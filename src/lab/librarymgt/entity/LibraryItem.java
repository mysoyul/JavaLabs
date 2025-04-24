package lab.librarymgt.entity;

// 추상 클래스: 도서관 자료
public abstract class LibraryItem {
    protected String title;
    protected String id;
    protected boolean checkedOut;
    
    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.checkedOut = false;
    }
    
    public void checkout() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " 대출 완료");
        } else {
            System.out.println(title + "은(는) 이미 대출 중입니다.");
        }
    }
    
    public void returnItem() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " 반납 완료");
        } else {
            System.out.println(title + "은(는) 이미 반납되었습니다.");
        }
    }
    
    // 추상 메소드: 자식 클래스에서 구현 필요
    public abstract void displayInfo();
}