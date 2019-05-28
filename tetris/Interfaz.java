package tetris;

import java.awt.Color;
import javax.swing.*;

public class Interfaz extends JPanel {

    public Interfaz(App juego) {

        setBounds(250, 0, 250, 600);
        JLabel nombre = new JLabel();
        nombre.setForeground(Color.WHITE);
        nombre.setText("TETRIS");

        JLabel puntuaciones = new JLabel();
        puntuaciones.setForeground(Color.WHITE);
        puntuaciones.setBackground(Color.BLACK);
        puntuaciones.setText("MEJORES PUNTUACIONES");

        JLabel instrucciones = new JLabel();
        instrucciones.setForeground(Color.WHITE);
        instrucciones.setText("Instrucciones:");

        JLabel left = new JLabel();
        left.setForeground(Color.WHITE);
        left.setText("VK_LEFT----Mover a la izquierda");

        JLabel right = new JLabel();
        right.setForeground(Color.WHITE);
        right.setText("VK_RIGHT----Mover a la derecha");

        JLabel up = new JLabel();
        up.setForeground(Color.WHITE);
        up.setText("VK_UP--------------------Girar pieza");

        JLabel down = new JLabel();
        down.setForeground(Color.WHITE);
        down.setText("VK_DOWN-------------Bajar rapido");

        JLabel p = new JLabel();
        p.setForeground(Color.WHITE);
        p.setText("p-----------------------------------Pausa");

        JLabel espacio = new JLabel();
        espacio.setForeground(Color.WHITE);
        espacio.setText("VK_SPACE----------bajar de golpe");

//                + "VK_LEFT----Mover a la izquierda"
//                + "VK_RIGHT---Mover a la derecha"
//                + "VK_UP------Girar pieza"
//                + "VK_DOWN----Bajar rapido"
//                + "p----------Pausa"
//                + "VK_SPACE---bajar de golpe");
//        
        Object[][] filas = {{"Iago", "10"}};
        Object[] columnas = {"NICK", "PUNTUACIÓN"};

        JTable tabla = new JTable(filas, columnas);
        tabla.setBackground(Color.BLACK);
        tabla.setForeground(Color.WHITE);

        JScrollPane barra = new JScrollPane(tabla);
        barra.setForeground(Color.WHITE);
        barra.setBackground(Color.BLACK);
        add(nombre);
        add(puntuaciones);
        add(instrucciones);
        add(left);
        add(right);
        add(up);
        add(down);
        add(p);
        add(espacio);
        add(barra);

        nombre.setBounds(100, 50, 50, 20);
        puntuaciones.setBounds(50, 380, 200, 20);
        barra.setBounds(25, 400, 200, 100);

        
        instrucciones.setBounds(30, 120, 200, 100);
        left.setBounds(30, 140, 200, 100);
        right.setBounds(30, 160, 200, 100);
        up.setBounds(30, 180, 200, 100);
        down.setBounds(30, 200, 200, 100);
        p.setBounds(30, 220, 200, 100);
        espacio.setBounds(30, 240, 200, 100);
        
    }
}
