package tetris;

import baseDatos.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class App {

    static int INDEX;

    public App() {
        baseDatos.Connect.connect();
        baseDatos.Create.createTable();

        baseDatos.Quest quest = new baseDatos.Quest();
        ArrayList<Alumno> datos = new ArrayList<Alumno>();

        baseDatos.Delete delete = new baseDatos.Delete();
//     delete.deleteAll(); //USAR PARA BORRAR LA BASE DE DATOS ENTERA
        datos = quest.selectAll();
//        System.out.println(datos.size());
        INDEX = datos.size() + 1;

        CrearEntorno game = new CrearEntorno();
        game.setLocationRelativeTo(null);//Para posicionar la ventana en el centro de la pantalla(automatico al ser null)
        game.setVisible(true);
    }

}
