package Tarea_03_Layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_I{
	
public static void main (String [] args) {
		
		Marco_Layout_I marco = new  Marco_Layout_I();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
	}
}
class Marco_Layout_I extends JFrame {
	
	public Marco_Layout_I() {
		setTitle("Prueba Acciones");
		
		setBounds(600,350,600,300);
		
		Panel_Layout lamina = new Panel_Layout();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		
		//lamina.setLayout(disposicion);
		
		Panel_Layout2 lamina2 = new Panel_Layout2();
		
		add(lamina,BorderLayout.NORTH);
		
		add(lamina2, BorderLayout.SOUTH);
	}
	
	class Panel_Layout extends JPanel{
		public Panel_Layout() {
			
		
			setLayout(new FlowLayout (FlowLayout.LEFT));
			
			add(new JButton ("Amarillo"));
			
			add(new JButton("Rojo"));
			
			
		}
	}
	
	class Panel_Layout2 extends JPanel{
		
		public Panel_Layout2() {
			
			setLayout(new BorderLayout());
			
			add(new JButton("Azul"),BorderLayout.WEST);
			
			add(new JButton("Verde"), BorderLayout.EAST);
			
			add(new JButton("Negro"), BorderLayout.CENTER);
		}
	}
}