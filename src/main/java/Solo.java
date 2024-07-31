import java.util.Date;

public class Solo extends Artiste {
    private String nom;
    private String prenom;
    private Date Date_de_naissance;


    public Solo(int id, String nom_de_scene, Date annee_de_debut, String nationalite, Date date_de_sortie) {
        super(id, nom_de_scene, annee_de_debut, nationalite, date_de_sortie);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_de_naissance() {
        return Date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        Date_de_naissance = date_de_naissance;
    }
}
