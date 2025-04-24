package lab.music.entity;
// MP3 클래스 - DigitalMedia를 상속받고 Playable 인터페이스 구현
public class MP3 extends DigitalMedia implements Playable {
    private int fileSize; // MB 단위
    private int volume;
    
    public MP3(String title, String artist, int fileSize) {
        super(title, artist, "MP3");
        this.fileSize = fileSize;
        this.volume = 5; // 기본 볼륨
    }
    
    // 추가 생성자 - 제목만 받고 나머지는 기본값으로 설정
    public MP3(String title) {
        this(title, "알 수 없음", 0);
    }
    
    @Override
    public void play() {
        super.play();
        System.out.println("현재 볼륨: " + volume);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("파일 크기: " + fileSize + "MB");
    }
    
    @Override
    public void setVolume(int level) {
        if (level >= 0 && level <= 10) {
            this.volume = level;
            System.out.println("볼륨이 " + level + "로 설정되었습니다.");
        } else {
            System.out.println("볼륨은 0-10 사이여야 합니다.");
        }
    }
    
    @Override
    public void stop() {
        System.out.println("MP3 재생이 중지되었습니다.");
    }
}