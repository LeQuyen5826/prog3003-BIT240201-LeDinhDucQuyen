package subsystem;

public class SoundSystem {
    public void on() {
        System.out.println("SoundSystem: Đã bật loa.");
    }
    
    public void setVolume(int level) {
        System.out.println("SoundSystem: Đặt âm lượng mức " + level);
    }
    
    public void off() {
        System.out.println("SoundSystem: Đã tắt loa.");
    }
}