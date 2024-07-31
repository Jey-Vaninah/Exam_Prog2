import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String nom;
    private List<Chansons> chansons;

    public Playlist(int id, String nom, List<Chansons> mes_chansons) {
        this.id = id;
        this.nom = nom;
        this.chansons = mes_chansons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Chansons> getMes_chansons() {
        return chansons;
    }

    public void setMes_chansons(ArrayList<Chansons> mes_chansons) {
        this.chansons = chansons;
    }

    public void addToPlaylist(Chansons chansons) {
        Chansons.add(chansons.getAlbum());

    }

    public void addToPlaylist(Album album) {
        Album.add(album);

    }

    public int removeById(int id) {
        chansons.removeIf(Chansons ->chansons.get(id) == Chansons);
        return id;
    }

}
