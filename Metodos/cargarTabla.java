/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import BaseDatos.Quest;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class cargarTabla {
        public static void vaciarTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; i < filas; i++) {
                modelo.removeRow(0);
            }

        } catch (Exception e) {
            System.out.println("no se pudo resetear la tabla");
        }
    }

    public static void mostrarTablas(JTable tabla) {
    
            Quest quest = new Quest();

   

        ArrayList<Object[]> listaclase = new ArrayList<Object[]>();
        listaclase = quest.selectAll();


        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (Object[] ele : listaclase) {
            modelo.addRow(ele);
        }
  

        tabla.setModel(modelo);

    }
}
