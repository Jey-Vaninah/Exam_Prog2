import java.time.Duration;

public class Chansons {
    private int id;
    private String titre;
    private Duration duration;
    private String genre;
    private Album album;
    private Artiste artiste;


    public Chansons(int id_chanson, String titre, Duration duration, String genre, Album album, Artiste artiste) {
        this.id = id_chanson;
        this.titre = titre;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.artiste = artiste;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public static void add(Album album) {
    }

}

