package BaseDatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author igonzaleziglesias
 */
public class Quest {

    static Object[] alumno;  

    ArrayList<Object[]> lista = new ArrayList<>();

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:puntuacion.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ArrayList selectAll() {
        String sql = "SELECT id, name, puntos FROM puntuacion ORDER BY puntos desc";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                alumno = new Object[4];
                alumno[0] = rs.getInt("id");
                alumno[1] = rs.getString("name");
                alumno[2] = rs.getString("puntos");

                lista.add(alumno);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            this.connect().close();
        } catch (SQLException ex) {
        }
        return lista;
    }

   

}