package DAO;

import modele.Utilisateur;

import java.sql.Connection;
import java.sql.SQLException;

public interface UtilisateurDAO {
    Utilisateur find (int id, Connection c) throws SQLException;
    boolean update(int id, Utilisateur u,Connection c) throws SQLException;
    boolean delete(int id, Utilisateur u, Connection c) throws SQLException;
}
