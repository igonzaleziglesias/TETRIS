package tetris;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.*;

public class App extends JFrame {

    JLabel marcador;

    public App() {
        setSize(500, 640);
        marcador = new JLabel(" 0");
        add(marcador, BorderLayout.SOUTH);

        JPanel fondo = new JPanel();
        fondo.setSize(500, 640);
        fondo.setBackground(Color.green);

        
        //juego
        Ventana ventana = new Ventana(this);
        ventana.setBorder(BorderFactory.createLineBorder(Color.white,1));

        ventana.setBackground(Color.BLACK);
        add(ventana);
        ventana.startGame();

        
        //informacion
        Interfaz interfaz = new Interfaz(this);
        interfaz.setBorder(BorderFactory.createLineBorder(Color.black,5));


        add(interfaz);
        this.add(fondo);

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
