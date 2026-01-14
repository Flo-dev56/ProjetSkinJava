package modele;

public class Utilisateur {
    private int idUtilisateur;
    private String pseudo;
    private int montant;

    //Constructeur
    public Utilisateur(int idUtilisateur, int montant, String pseudo) {
        this.idUtilisateur = idUtilisateur;
        this.montant = montant;
        this.pseudo = pseudo;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
