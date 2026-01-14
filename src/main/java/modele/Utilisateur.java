package modele;

public class Utilisateur {
    private String pseudo;
    private int idUtilisateur;

    //Constructeur


    public Utilisateur(String pseudo, int idUtilisateur) {
        this.pseudo = pseudo;
        this.idUtilisateur = idUtilisateur;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
}
