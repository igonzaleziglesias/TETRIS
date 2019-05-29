package tetris;

import BaseDatos.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class App {

    static int INDEX;

    public App() {
        BaseDatos.Connect.connect();
        BaseDatos.Create.createTable();

        BaseDatos.Quest quest = new BaseDatos.Quest();
        ArrayList<Alumno> datos = new ArrayList<Alumno>();

        BaseDatos.Delete delete = new BaseDatos.Delete();
//     delete.deleteAll(); //USAR PARA BORRAR LA BASE DE DATOS ENTERA
        datos = quest.selectAll();
//        System.out.println(datos.size());
        INDEX = datos.size() + 1;

        CrearEntorno game = new CrearEntorno();
        game.setLocationRelativeTo(null);//Para posicionar la ventana en el centro de la pantalla(automatico al ser null)
        game.setVisible(true);
    }

}
