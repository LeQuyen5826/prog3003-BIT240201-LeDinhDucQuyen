package subsystem;

public class DVDPlayer {
    public void on() {
        System.out.println("DVDPlayer: Đã bật đầu DVD.");
    }
    
    public void play(String movie) {
        System.out.println("DVDPlayer: Đang phát phim: " + movie);
    }
    
    public void off() {
        System.out.println("DVDPlayer: Đã tắt đầu DVD.");
    }
}
