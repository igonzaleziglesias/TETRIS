package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void createTable() {

        String url = "jdbc:sqlite:puntuacion.db";

        String sql = "CREATE TABLE IF NOT EXISTS puntuacion ("
                + "	id integer PRIMARY KEY,"
                + "	name text NOT NULL,"
                + "	puntos text NOT NULL"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}