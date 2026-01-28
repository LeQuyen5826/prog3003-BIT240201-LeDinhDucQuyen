package subsystem;

public class TV {
    public void on() {
        System.out.println("TV: Đã bật tivi.");
    }
    
    public void off() {
        System.out.println("TV: Đã tắt tivi.");
    }
    
    public void setInput(String input) {
        System.out.println("TV: Chuyển input sang " + input);
    }
}