package services;

import DAO.UtilisateurDAO;
import DAO.UtilisateurDAOImpl;
import modele.Utilisateur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServiceUtilisateur {
    private UtilisateurDAO userDAO;
    private Connection conn;

    public ServiceUtilisateur() {
        userDAO = new UtilisateurDAOImpl();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://109.234.166.12:3306/tima6358_kpinel", "tima6358_kpinel", "@Bidoof56!");
        } catch (SQLException e) {
            System.err.format("Erreur SQL:%s \n%s", e.getSQLState(), e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
