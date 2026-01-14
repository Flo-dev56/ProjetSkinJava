package modele;

public class Modele {
    private int idModele;
    private String nomModele;

    //Constructeur
    public Modele(String nomModele, int idModele) {
        this.nomModele = nomModele;
        this.idModele = idModele;
    }

    public int getIdModele() {
        return idModele;
    }

    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }

    public String getNomModele() {
        return nomModele;
    }

    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }
}
