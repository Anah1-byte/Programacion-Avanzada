package Tarea_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch extends JFrame {
	
    private JButton startButton, stopButton, exitButton;
    private JLabel startLabel, stopLabel, elapsedLabel;
    private JTextField startTextField, stopTextField, elapsedTextField;
    private long startTime, stopTime;

    public Stopwatch() {
        setTitle("Stopwatch Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        // inicializar componentes
        startButton = new JButton("Iniciar Tiempo");
        stopButton = new JButton("Detener Tiempo");
        exitButton = new JButton("Exit");

        startLabel = new JLabel("Tiempo Iniciado:");
        stopLabel = new JLabel("Tiempo Detenido:");
        elapsedLabel = new JLabel("Elapsed Time (sec):");

        startTextField = new JTextField(15);
        stopTextField = new JTextField(15);
        elapsedTextField = new JTextField(15);

        // deshabilitar edición de los campos de texto
        startTextField.setEditable(false);
        stopTextField.setEditable(false);
        elapsedTextField.setEditable(false);

        // añadir componentes a la ventana
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(startButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        add(startLabel, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        add(startTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(stopButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(stopLabel, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        add(stopTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        add(exitButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        add(elapsedLabel, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        add(elapsedTextField, constraints);

        // configurar eventos de los botones
        startButton.addActionListener(e -> startButtonActionPerformed());
        stopButton.addActionListener(e -> stopButtonActionPerformed());
        exitButton.addActionListener(e -> exitButtonActionPerformed());

        pack();
        setLocationRelativeTo(null); // centrar la ventana
    }
    
    private void startButtonActionPerformed() {
        startTime = System.currentTimeMillis();
        startTextField.setText(String.valueOf(startTime));
        stopTextField.setText("");
        elapsedTextField.setText("");
    }

    private void stopButtonActionPerformed() {
        stopTime = System.currentTimeMillis();
        stopTextField.setText(String.valueOf(stopTime));

        double elapsedTime = (stopTime - startTime) / 1000.0;
        elapsedTextField.setText(String.valueOf(elapsedTime));
    }

    private void exitButtonActionPerformed() {
        System.exit(0);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.setVisible(true);
        });
    }

}