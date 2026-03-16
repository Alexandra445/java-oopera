import java.util.ArrayList;

public class MusicalShow extends Show {
    public String musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто:");
        System.out.println(librettoText);
    }
}
