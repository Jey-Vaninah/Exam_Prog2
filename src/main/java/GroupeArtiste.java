import java.util.ArrayList;
import java.util.Date;

public class GroupeArtiste extends Artiste{
    private ArrayList<Solo>membres;

    public GroupeArtiste(int id, String nom_de_scene, Date annee_de_debut, String nationalite, Date date_de_sortie) {
        super(id, nom_de_scene, annee_de_debut, nationalite, date_de_sortie);
    }

    public ArrayList<Solo> getMembres() {
        return membres;
    }

    public void setMembres(ArrayList<Solo> membres) {
        this.membres = membres;
    }
}
