package modele;

public class TypeArme {
    private int idType;
    private String nomType;

    //Constructeur

    public TypeArme(int idType, String nomType) {
        this.idType = idType;
        this.nomType = nomType;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }
}
