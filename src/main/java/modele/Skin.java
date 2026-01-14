package modele;

public class Skin {
    private int idSkin;
    private String nom;
    private int prix;

    //Constructeur
    public Skin(int idSkin, int prix, String nom) {
        this.idSkin = idSkin;
        this.prix = prix;
        this.nom = nom;
    }

    public int getIdSkin() {
        return idSkin;
    }

    public void setIdSkin(int idSkin) {
        this.idSkin = idSkin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
