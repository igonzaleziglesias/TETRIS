package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author igonzaleziglesias
 */
public class Quest{

    

   ArrayList<Alumno> lista = new ArrayList<Alumno>();

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

    public ArrayList<Alumno> selectAll() {
        String sql = "SELECT name, puntos, id FROM puntuacion";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Alumno alum = new Alumno(rs.getInt("id"),rs.getString("name"),rs.getString("puntos"));
//                alumno[2] = rs.getInt("id");
//                alumno[0] = rs.getString("name");
//                alumno[1] = rs.getString("puntos");

                lista.add(alum);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            this.connect().close();
        } catch (SQLException ex) {
        }
        Collections.sort(lista);
//        for (int i=0 ;i<lista.size();i++){
//            System.out.println(lista.get(i).getName());
//        }
        return lista;

    }

   
}
