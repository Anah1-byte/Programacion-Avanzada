package Tarea_02;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo_02_a  extends JFrame{
	
	JLabel a,b;
	
	public Ejemplo_02_a () {
		this.setTitle("2020-3");
		this.setBounds(10,20,300,200);
		a = new JLabel ("El triangulo de base 2 * 5");
		a.setBounds(10,20,200,30);
		b = new JLabel ();
		b.setBounds(10,50,300,30);
		add(a);
		//add(b);
	}

	public static void main (String [] args) {
		Ejemplo_02_a ventana = new Ejemplo_02_a();
		ventana.setVisible(true);
	}
}
