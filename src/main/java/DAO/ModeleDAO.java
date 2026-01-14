package DAO;

import modele.Modele;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ModeleDAO {
    Modele find (int id, Connection c);
    List<Modele> findAll(Connection c) throws SQLException;
    List<Modele> findByName(String name, Connection c) throws SQLException;
}
