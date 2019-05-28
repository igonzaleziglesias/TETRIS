package tetris;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.*;

public class App extends JFrame {

    JLabel marcador;

    public App() {
        setSize(515, 655);
//        definir
        marcador = new JLabel(" 0");
        add(marcador, BorderLayout.SOUTH);

        JPanel fondo = new JPanel();
        Ventana ventana = new Ventana(this);        //juego
        Interfaz interfaz = new Interfaz(this);  //informacion

//        JLabel nombre = new JLabel();
//        nombre.setText("TETRIS");
//        
//        JLabel puntuaciones = new JLabel();
//        puntuaciones.setText("MEJORES PUNTUACIONES");
//        Object[][] filas = {{"Iago", "10"}};
//        Object[] columnas = {"nick", "puntuacion"};
//
//        JTable tabla = new JTable(filas, columnas);
//
//        JScrollPane barra = new JScrollPane(tabla);

        //dimensiones
        fondo.setSize(500, 640);
//        barra.setBounds(25, 400, 200, 100);
        //añadir elementos
        ventana.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        ventana.setLayout(null);
        interfaz.setBorder(BorderFactory.createLineBorder(Color.white, 5));
        interfaz.setLayout(null);

        interfaz.setBackground(Color.BLACK);
        ventana.setBackground(Color.BLACK);
        fondo.setBackground(Color.WHITE);

        //ASIGNACION Y DIMENSION DE OBJETOS
//        interfaz.add(nombre);
//        nombre.setBounds(100, 50, 50, 20);
//        tabla.setLayout(null);
//        interfaz.add(barra);

//        tabla.setBounds(0, 0, 200, 80);
        add(interfaz);
        add(ventana);
        add(fondo);
        ventana.startGame();

        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void exit() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getStatusBar() {
        return marcador;
    }

}
