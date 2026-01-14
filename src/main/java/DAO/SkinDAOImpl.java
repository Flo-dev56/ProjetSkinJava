package DAO;

import modele.Skin;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class SkinDAOImpl implements SkinDAO{
    @Override
    public Skin find(int id, Connection c) throws SQLException {
        return null;
    }

    @Override
    public List<Skin> findAll(Connection c) throws SQLException {
        return List.of();
    }

    @Override
    public List<Skin> findByName(String name, Connection c) throws SQLException {
        return List.of();
    }
}
