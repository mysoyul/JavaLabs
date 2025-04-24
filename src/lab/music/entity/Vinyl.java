package lab.music.entity;
// Vinyl 클래스 - 아날로그 음악 미디어
public class Vinyl extends MusicMedia {
    private int rpm; // 회전 속도
    
    public Vinyl(String title, String artist, int rpm) {
        super(title, artist);
        this.rpm = rpm;
    }
    
    @Override
    public void play() {
        System.out.println("바이닐 레코드 '" + title + "'이(가) " + rpm + "rpm으로 재생됩니다.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("회전 속도: " + rpm + " rpm");
    }
    
    // Vinyl 고유의 메소드
    public void clean() {
        System.out.println("바이닐 레코드를 청소합니다.");
    }
}