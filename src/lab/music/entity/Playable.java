package lab.music.entity;
// Playable 인터페이스 - 재생 가능한 미디어가 구현해야 하는 기능
public interface Playable {
    void setVolume(int level);
    void stop();
}