package lab.book.control;

import java.util.ArrayList;
import java.util.List;

import lab.book.entity.Magazine;
import lab.book.entity.Novel;
import lab.book.entity.Publication;
import lab.book.entity.ReferenceBook;

public class ShoppingCart {
    private List<Publication> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    // 장바구니에 물품 추가
    public void addItem(Publication item) {
        items.add(item);
        System.out.println(item.getTitle() + "이(가) 장바구니에 추가되었습니다.");
    }
    
    // 장바구니에서 물품 제거
    public boolean removeItem(String title) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equals(title)) {
                Publication removed = items.remove(i);
                System.out.println(removed.getTitle() + "이(가) 장바구니에서 제거되었습니다.");
                return true;
            }
        }
        System.out.println("해당 제목의 출판물을 찾을 수 없습니다.");
        return false;
    }
    
    // 장바구니 내용 출력
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        
        System.out.println("====== 장바구니 내용 ======");
        for (int i = 0; i < items.size(); i++) {
            Publication item = items.get(i);
            System.out.printf("%d. %s - %,d원\n", i+1, item.getTitle(), item.getPrice());
        }
        System.out.printf("총 가격: %,d원\n", calculateTotalPrice());
        System.out.println("할인 적용 가격: " + calculateDiscountedPrice() + "원");
    }
    
    // 총 가격 계산
    public int calculateTotalPrice() {
        int total = 0;
        for (Publication item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
    // 할인이 적용된 가격 계산 (다형성 활용)
    public int calculateDiscountedPrice() {
        int total = 0;
        for (Publication item : items) {
            // 출판물 타입에 따라 다른 할인율 적용
            if (item instanceof Magazine) {
                total += item.getPrice() * 0.9; // 잡지는 10% 할인
            } else if (item instanceof Novel) {
                total += item.getPrice() * 0.85; // 소설은 15% 할인
            } else if (item instanceof ReferenceBook) {
                total += item.getPrice() * 0.8; // 참고서는 20% 할인
            } else {
                total += item.getPrice(); // 기본 출판물은 할인 없음
            }
        }
        return total;
    }
    
    // 출판물 타입별 통계 출력
    public void printStatistics() {
        int magazineCount = 0;
        int novelCount = 0;
        int referenceBookCount = 0;
        
        for (Publication item : items) {
            if (item instanceof Magazine) {
                magazineCount++;
            } else if (item instanceof Novel) {
                novelCount++;
            } else if (item instanceof ReferenceBook) {
                referenceBookCount++;
            }
        }
        
        System.out.println("====== 장바구니 통계 ======");
        System.out.println("잡지: " + magazineCount + "권");
        System.out.println("소설: " + novelCount + "권");
        System.out.println("참고서: " + referenceBookCount + "권");
        System.out.println("총 출판물: " + items.size() + "권");
    }
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // 장바구니에 다양한 출판물 추가
        cart.addItem(new Magazine("마이크로소프트", "2007-10-01", 328, 9900, "매월"));
        cart.addItem(new Magazine("경영과컴퓨터", "2007-10-03", 316, 9000, "매월"));
        cart.addItem(new Novel("빠삐용", "2007-07-01", 396, 9800, "베르나르베르베르", "현대소설"));
        cart.addItem(new Novel("남한산성", "2007-04-14", 383, 11000, "김훈", "대하소설"));
        cart.addItem(new ReferenceBook("실용주의프로그래머", "2007-01-14", 496, 25000, "소프트웨어공학"));
        
        // 장바구니 내용 출력
        cart.displayCart();
        
        // 통계 출력
        cart.printStatistics();
        
        // 항목 제거
        cart.removeItem("빠삐용");
        
        // 장바구니 내용 다시 출력
        cart.displayCart();
    }
}