import java.util.Date;

public abstract class Artiste {
    private int id;
    private String nom_de_scene;
    private Date annee_de_debut;
    private String nationalite;
    private Date date_de_sortie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_de_scene() {
        return nom_de_scene;
    }

    public void setNom_de_scene(String nom_de_scene) {
        this.nom_de_scene = nom_de_scene;
    }

    public Date getAnnee_de_debut() {
        return annee_de_debut;
    }

    public void setAnnee_de_debut(Date annee_de_debut) {
        this.annee_de_debut = annee_de_debut;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public Date getDate_de_sortie() {
        return date_de_sortie;
    }

    public void setDate_de_sortie(Date date_de_sortie) {
        this.date_de_sortie = date_de_sortie;
    }

    public Artiste(int id, String nom_de_scene, Date annee_de_debut, String nationalite, Date date_de_sortie) {
        this.id = id;
        this.nom_de_scene = nom_de_scene;
        this.annee_de_debut = annee_de_debut;
        this.nationalite = nationalite;
        this.date_de_sortie = date_de_sortie;


    }
}


