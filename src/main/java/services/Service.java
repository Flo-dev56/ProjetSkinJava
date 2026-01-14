package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Service {
    public Service() {
        try {
            //chargement de la classe correspondant au driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connexion à la base de donnée
            Connection cx = DriverManager.getConnection(
                    "jdbc:mysql://109.234.166.12/tima6358_kpinel",
                    "tima6358_kpinel", "@Bidoll");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
