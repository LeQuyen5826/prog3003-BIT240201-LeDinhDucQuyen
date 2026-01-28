import facade.HomeTheaterFacade;
import subsystem.*;

public class App {
    public static void main(String[] args) {
        
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        DVDPlayer dvd = new DVDPlayer();
        Lights lights = new Lights();
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, sound, dvd, lights);
        
        homeTheater.watchMovie("Avengers: Endgame");
        
        homeTheater.endMovie();
    }
}