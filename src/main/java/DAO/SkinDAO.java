package DAO;

import modele.Skin;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface SkinDAO {
    Skin find (int id, Connection c) throws SQLException;
    List<Skin> findAll(Connection c) throws SQLException;
    List<Skin> findByName(String name, Connection c) throws SQLException;
}
