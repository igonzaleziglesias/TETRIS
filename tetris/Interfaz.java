package tetris;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Interfaz extends JPanel {

    public static JTable tabla = new JTable();

    public Interfaz(CrearEntorno juego) {

        setBounds(250, 0, 250, 600);//dimension del panel
        JLabel nombre = new JLabel();
        Font auxFont = nombre.getFont();
        nombre.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));//aumentamos el tamaño de la letra
        nombre.setForeground(Color.WHITE);//dar color de letra blanco
        nombre.setText("TETRIS");//asignar texto

        JLabel puntuaciones = new JLabel();
        puntuaciones.setForeground(Color.WHITE);//color de letra blanco
        puntuaciones.setBackground(Color.BLACK);//color de fondo negro
        puntuaciones.setText("MEJORES PUNTUACIONES");//asignar texto

        JLabel instrucciones = new JLabel();
        instrucciones.setForeground(Color.WHITE);//dar color de letra blanco
        instrucciones.setText("Instrucciones:");//asignar texto

        JLabel left = new JLabel();
        left.setForeground(Color.WHITE);//dar color blanco
        left.setText("VK_LEFT----Mover a la izquierda");//asignar valor de texto

        JLabel right = new JLabel();
        right.setForeground(Color.WHITE);//dar color blanco
        right.setText("VK_RIGHT----Mover a la derecha");//asignar valor de texto

        JLabel up = new JLabel();
        up.setForeground(Color.WHITE);//dar color blanco
        up.setText("VK_UP--------------------Girar pieza");//asignar valor de texto

        JLabel down = new JLabel();
        down.setForeground(Color.WHITE);//dar color blanco
        down.setText("VK_DOWN-------------Bajar rapido");//asignar valor de texto

        JLabel p = new JLabel();
        p.setForeground(Color.WHITE);//dar color blanco
        p.setText("p-----------------------------------Pausa");//asignar valor de texto

        JLabel espacio = new JLabel();
        espacio.setForeground(Color.WHITE);//dar color blanco
        espacio.setText("VK_SPACE----------bajar de golpe");//asignar valor de texto

        tabla.setModel(new javax.swing.table.DefaultTableModel(//formato a la tabla 
                new Object[][]{},
                new String[]{
                    "Nº", "NICK", "PUNTOS"
                }
        ));
        tabla.setBackground(Color.BLACK);//fonde negro
        tabla.setForeground(Color.WHITE);//letra blanca

        JScrollPane barra = new JScrollPane(tabla);//para mostrar los titulos de las columnas
        barra.setForeground(Color.WHITE);//letra blanca
        barra.setBackground(Color.BLACK);//fondo negro
        //añadir elementos
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
//dimesnionar
        nombre.setBounds(75, 50, 200, 50);
        puntuaciones.setBounds(50, 380, 200, 20);
        barra.setBounds(25, 400, 200, 100);

        instrucciones.setBounds(30, 120, 200, 100);
        left.setBounds(30, 140, 200, 100);
        right.setBounds(30, 160, 200, 100);
        up.setBounds(30, 180, 200, 100);
        down.setBounds(30, 200, 200, 100);
        p.setBounds(30, 220, 200, 100);
        espacio.setBounds(30, 240, 200, 100);

        Metodos.cargarTabla.mostrarTablas(tabla);//mostrar datos en la tabla

    }
}
