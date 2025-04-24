package lab.music.control;

import lab.music.entity.MP3;
import lab.music.entity.MusicMedia;
import lab.music.entity.Playable;
import lab.music.entity.Vinyl;

public class MusicPlayerTest {
    public static void main(String[] args) {
        System.out.println("===== 음악 재생 시스템 테스트 =====");
        
        // 객체 생성
        MP3 mp3 = new MP3("Dynamite", "BTS", 5);
        Vinyl vinyl = new Vinyl("Yesterday", "The Beatles", 33);
        
        // 다형성을 활용한 객체 생성
        MusicMedia media1 = new MP3("Butter", "BTS", 4);
        Playable playable = new MP3("Permission to Dance");
        
        // 메소드 호출 테스트
        System.out.println("\n--- MP3 테스트 ---");
        mp3.displayInfo();
        mp3.play();
        mp3.setVolume(8);
        mp3.play();
        mp3.stop();
        
        System.out.println("\n--- Vinyl 테스트 ---");
        vinyl.displayInfo();
        vinyl.play();
        vinyl.clean();
        
        System.out.println("\n--- 다형성 테스트 ---");
        media1.displayInfo();
        media1.play();
        
        // 캐스팅 테스트
        System.out.println("\n--- 캐스팅 테스트 ---");
        if (media1 instanceof MP3) {
            MP3 castedMp3 = (MP3) media1;
            castedMp3.setVolume(3);
            castedMp3.play();
        }
        
        playable.setVolume(7);
        playable.stop();
    }
}