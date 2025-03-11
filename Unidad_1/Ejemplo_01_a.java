package Tarea_02;

import javax.swing.JFrame;

public class Ejemplo_01_a extends JFrame {
	public Ejemplo_01_a() {
	}

	
	public static void main (String [] args)
	{
		Ejemplo_01_a ventana = new Ejemplo_01_a ();
		ventana.setTitle ("2020-3");
		ventana.setBounds(10,20,400,300);
		ventana.setVisible(true);
	}
}