package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame {

    JLabel marcador;

    public App() {

        marcador = new JLabel(" 0");
        add(marcador, BorderLayout.SOUTH);
        Ventana ventana = new Ventana(this);
        ventana.setBackground(Color.BLACK);
        add(ventana);
        ventana.startGame();

        setSize(250, 600);
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
