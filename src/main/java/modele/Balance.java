package modele;

public class Balance {
    private int idBalance;
    private int montant;

    //Constructeur
    public Balance(int idBalance, int montant) {
        this.idBalance = idBalance;
        this.montant = montant;
    }

    public int getIdBalance() {
        return idBalance;
    }

    public void setIdBalance(int idBalance) {
        this.idBalance = idBalance;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
