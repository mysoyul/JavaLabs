package lab.music.entity;
// DigitalMedia 클래스 - 디지털 형식의 음악 미디어
public class DigitalMedia extends MusicMedia {
    protected String format;
    
    public DigitalMedia(String title, String artist, String format) {
        super(title, artist); // 부모 클래스의 생성자 호출
        this.format = format;
    }
    
    @Override
    public void play() {
        System.out.println(format + " 형식의 '" + title + "'이(가) 디지털로 재생됩니다.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // 부모 클래스의 메소드 호출
        System.out.println("포맷: " + format);
    }
}