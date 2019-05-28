package tetris;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.*;

public class CrearEntorno extends JFrame {

    JLabel marcador;

    public CrearEntorno() {
        setSize(517, 650);
//        definir
        marcador = new JLabel(" 0");
//        marcador.setForeground(Color.white);
        Font auxFont = marcador.getFont();
        marcador.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));//aumentamos el tamaño de la letra
        marcador.setForeground(Color.WHITE);//dar color de letra blanco
//        add(marcador, BorderLayout.SOUTH);

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
        ventana.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        ventana.setLayout(null);
        interfaz.setBorder(BorderFactory.createLineBorder(Color.white, 2));
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
        interfaz.add(marcador);
        marcador.setBounds(180, 140, 50,50);
        
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
