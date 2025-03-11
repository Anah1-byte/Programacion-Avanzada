package Tarea_02;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo_02_c extends JFrame{

	static JLabel a,b;
	
	public Ejemplo_02_c() {
		getContentPane().setLayout(null);
		this.setTitle("2020-3");
		this.setBounds(10,20,345,251);
		a = new JLabel ("El triangulo de base 2 * 5");
		a.setBounds(10, 10, 200, 300);
		b = new JLabel();
		b.setBounds(10,50,300,30);
		getContentPane().add(a);
		getContentPane().add(b);
	}
	
	public static void main (String [] args) {
		Ejemplo_02_c ventana = new Ejemplo_02_c();
		b.setText("( 2 * 5 ) / 2 = 5 ");
		ventana.setVisible(true);
		}
}
