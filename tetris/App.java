package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App extends JFrame {

    JLabel marcador;

    public App() {
        setSize(500, 640);
        marcador = new JLabel(" 0");
        add(marcador, BorderLayout.SOUTH);

        JPanel fondo = new JPanel();
        fondo.setSize(500, 640);
        fondo.setBackground(Color.green);

        Ventana ventana = new Ventana(this);
        ventana.setBorder(BorderFactory.createLineBorder(Color.white,1));

        ventana.setBackground(Color.BLACK);
        add(ventana);
        ventana.startGame();

        Interfaz interfaz = new Interfaz(this);
        interfaz.setBorder(BorderFactory.createLineBorder(Color.black,5));

//        interfaz.setBackground(Color.red);
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
