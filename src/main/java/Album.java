import java.util.List;

public class Album {
    private int id;
    private String nom_album;
    private List<Chansons>chansons;

    public Album(int id, String nom_album, List<Chansons> chansons) {
        this.id = id;
        this.nom_album = nom_album;
        this.chansons = chansons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_album() {
        return nom_album;
    }

    public void setNom_album(String nom_album) {
        this.nom_album = nom_album;
    }

    public List<Chansons> getChansons() {
        return chansons;
    }

    public void setChansons(List<Chansons> chansons) {
        this.chansons = chansons;
    }

    public static void add(Album album) {

    }


}
