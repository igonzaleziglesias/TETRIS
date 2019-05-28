package tetris;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends JPanel {

    public Interfaz(App juego) {
        setLayout(null);
        setVisible(true);
        setBounds(250, 0, 250, 600);
        setBackground(Color.red);

        
        
        JLabel nombre = new JLabel();
        nombre.setText("TETRIS");     
        nombre.setBounds(300, 400, WIDTH, HEIGHT);
        add(nombre);
       
        
        
        
//        
//        JTable tabla = new JTable();       
//        tabla.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "nick","puntuacion"
//            }
//        ));
//        JScrollPane barrita = new javax.swing.JScrollPane();
//        barrita.setViewportView(tabla);
//        tabla.setBounds(300, 400, 200, 400);
//        
//        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
//        modelo.addRow(new Object[]{"iago","4"}); 
//        modelo.addRow(new Object[]{"cesar","5"});      
//        modelo.addRow(new Object[]{"iago","4"});      
//        tabla.setModel(modelo);
//        
//        add(tabla);
    }
}
