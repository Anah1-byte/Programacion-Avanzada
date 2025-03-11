package Tarea06_NetMaui;

import javax.swing.*;
import java.awt.*;

public class CustomViewExample {

    public static void main(String[] args) {
        // Crear el JFrame principal
        JFrame frame = new JFrame("Especificación del Tamaño de una Vista");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null); // Usamos un diseño nulo para control absoluto

        // Crear un JLabel con tamaño y posición personalizada
        JLabel label = new JLabel("Hello");
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setBounds(100, 50, 200, 50); // x, y, ancho, alto

        // Crear un JButton con tamaño y posición personalizada
        JButton button = new JButton("Iniciar sesión");
        button.setBounds(100, 150, 200, 50);

        // Agregar componentes al JFrame
        frame.add(label);
        frame.add(button);

        // Mostrar el JFrame
        frame.setVisible(true);
    }
}
