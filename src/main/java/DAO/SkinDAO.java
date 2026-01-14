package DAO;

import modele.Skin;

import java.sql.Connection;
import java.sql.SQLException;

public interface SkinDAO {
    Skin find (int id, Connection c) throws SQLException;
}
