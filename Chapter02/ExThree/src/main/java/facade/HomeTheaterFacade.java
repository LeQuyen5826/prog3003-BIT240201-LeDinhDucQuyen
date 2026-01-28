package facade;

import subsystem.*;

public class HomeTheaterFacade {
    
    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;
    private Lights lights;
    
    public HomeTheaterFacade(TV tv, SoundSystem sound, DVDPlayer dvd, Lights lights) {
        this.tv = tv;
        this.sound = sound;
        this.dvd = dvd;
        this.lights = lights;
    }
    
    public void watchMovie(String movie) {
        System.out.println("\nHomeTheaterFacade: Bắt đầu xem phim \"" + movie + "\"...");
        
        lights.dim();             
        tv.on();                
        tv.setInput("DVD");        
        sound.on();                
        sound.setVolume(10);       
        dvd.on();                  
        dvd.play(movie);           
        
        System.out.println("HomeTheaterFacade: Phim đã sẵn sàng! Chúc xem vui vẻ!");
    }
    
    public void endMovie() {
        System.out.println("\nHomeTheaterFacade: Kết thúc xem phim...");
        
        dvd.off();
        sound.off();
        tv.off();
        lights.on();              
        
        System.out.println("HomeTheaterFacade: Đã tắt hết thiết bị.");
    }
}