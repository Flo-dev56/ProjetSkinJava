import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args) throws Exception {
//chargement de la classe correspondant au driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connexion a la base de pilote
        Connection cx = DriverManager.getConnection(
                "jdbc:mysql://109.234.166.12:3306/tima6358_kpinel", "tima6358_kpinel", "@Bidoof56!");
        Statement st = cx.createStatement();
        //execute la requete
        ResultSet rs = st.executeQuery("SELECT * FROM U;");

        //parcours du resultat
        if (rs.next()){
            System.out.println("OUI");
        }
    }
}

