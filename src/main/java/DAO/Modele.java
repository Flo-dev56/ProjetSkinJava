package DAO;

import java.sql.Connection;

public interface Modele {
    Modele find (int id, Connection c);
}
