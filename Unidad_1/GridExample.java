package Tarea06_NetMaui;

import javax.swing.*;
import java.awt.*;

public class GridExample {
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Ejemplo de GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);

        // Establecer el layout en GridLayout con 7 filas y 5 columnas
        frame.setLayout(new GridLayout(7, 5, 5, 5)); // Espaciado opcional de 5 píxeles entre filas y columnas

        // Añadir componentes a la cuadrícula
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                JButton button = new JButton("Fila " + i + " Columna " + j);
                frame.add(button); // Añadir el botón a la cuadrícula
            }
        }

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}
