/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.swing.JOptionPane;

public class Pedir {//Libreria

    public static int pedirInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    public static float pedirFloat(String msg) {
        return Float.parseFloat(JOptionPane.showInputDialog(msg));
    }

    public static String pedirString(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

}
