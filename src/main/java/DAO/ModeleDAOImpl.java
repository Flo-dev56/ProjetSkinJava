package DAO;

import modele.Modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModeleDAOImpl implements ModeleDAO {
    @Override
    public Modele find(int id, Connection c) {
        return null;
    }

    @Override

        public List<Modele> findAll (Connection c) throws SQLException {
            String q = "SELECT * FROM Modele";
            List<Modele> res = new ArrayList<>();
            try {
                PreparedStatement pstm = c.prepareStatement(q);
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    Modele user = new Modele(rs.getString("nomModele"), rs.getInt("idModele"));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            return res;
        }


    @Override
    public List<Modele> findByName(String name, Connection c) throws SQLException {
        return List.of();
    }
}
}