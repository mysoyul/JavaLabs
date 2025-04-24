package lab.music.entity;
// 추상 클래스 - 모든 음악 미디어의 기본이 되는 클래스
public abstract class MusicMedia {
    protected String title;
    protected String artist;
    
    // 보호된 생성자
    protected MusicMedia(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    // 추상 메소드 - 자식 클래스에서 반드시 구현해야 함
    public abstract void play();
    
    // 구체적인 메소드
    public void displayInfo() {
        System.out.println("제목: " + title + ", 아티스트: " + artist);
    }
}