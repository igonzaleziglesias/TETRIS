/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import baseDatos.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static tetris.App.INDEX;

public class Menu {

    public void crearMenu() {
        String[] elecciones = {"Jugar", "Salir"};//mensaje final de partida
        //implementar aqui insercion en base de datos
        int eleccion = JOptionPane.showOptionDialog(
                null,
                "Bienvenido a Tetris! ヽ(^o^)ノ ",
                null,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                elecciones,
                null
        );

        switch (eleccion) {

            case 0:
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
                break;
            case 1:
                System.exit(0);
                break;

        }

    }
}
