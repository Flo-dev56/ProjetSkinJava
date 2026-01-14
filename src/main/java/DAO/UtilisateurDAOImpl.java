package DAO;

import modele.Utilisateur;
import views.Util;

import java.sql.*;

public class UtilisateurDAOImpl implements UtilisateurDAO {
    @Override
    public Utilisateur find(int id, Connection c) throws SQLException {
        PreparedStatement pst = c.prepareStatement("select * from Utilisateur where idUtilisateur = ?");
        Utilisateur user = null;
        pst.setInt(1, id);
        try {
            //recupérer le resultset
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                //instancier user à partir des valeurs récupérées
                user = new Utilisateur(rs.getInt("idUtilisateur"), rs.getInt("montant"), rs.getString("pseudo"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public boolean update(int id, Utilisateur u, Connection c) throws SQLException {
        PreparedStatement pst =
                c.prepareStatement("update Utilisateur set montant=?" +
                        "where idUtilisateur = ?");
        pst.setInt(1, u.getMontant());
        pst.setInt(2,u.getIdUtilisateur());

        int ligne = pst.executeUpdate();
        return ligne > 0;
    }

}
