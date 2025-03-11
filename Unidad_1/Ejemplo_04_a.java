package Tarea_02;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class Ejemplo_04_a extends JFrame implements ActionListener{
	static JLabel La,Lb,Lc;
	static JButton Bcalcular,Bsalir;
	static JTextField Ta,Th,Tb;
	
	public Ejemplo_04_a (){
		getContentPane().setLayout(null);
		this.setTitle("Anahi Castillo   Ejemplo04_a");
		this.setBounds(10,10,350,300);
		La = new JLabel ("Introduce el valor de la Altura");
		La.setBounds(10,10,200,30);
		Lb = new JLabel ("Introduce el valor de la Base");
		Lb.setBounds(10,40,200,30);
		Lc = new JLabel ("El area es igual a -->");
		Lc.setBounds(10,110,200,30);
		Th = new JTextField("");
		Th.setBounds(220,10,100,30);
		Tb = new JTextField ("");
		Tb.setBounds(220,40,100,30);
		Ta = new JTextField ("");
		Ta.setBounds(220,110,100,30);
		Ta.setEditable(false);
		
		Bcalcular = new JButton();
		Bcalcular.setText("Calcular");
		Bcalcular.setBounds(10,70,100,30);
		Bcalcular.addActionListener(this);
		Bsalir = new JButton();
		Bsalir.setText("Salir");
		Bsalir.setBounds(121,70,100,30);
		Bsalir.addActionListener(this);
		
		getContentPane().add(La);
		getContentPane().add(Lb);
		getContentPane().add(Lc);
		getContentPane().add(Bcalcular);
		getContentPane().add(Bsalir);
		getContentPane().add(Th);
		getContentPane().add(Tb);
		getContentPane().add(Ta);
	}
	@Override
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == Bcalcular) {
			double h,b,a;
			String Sh,Sb;
			Sh = Th.getText();
			Sb = Tb.getText();
			if ( !Sh.isEmpty() &&!Sb.isEmpty()) {
				h = Double.parseDouble(Sh);
				b = Double.parseDouble(Sb);
				a = (h * b) / 2 ;
				Ta.setText(String.valueOf(a));
			}
			else JOptionPane.showMessageDialog(this,"Lo siento uno o dos textos estan vacios");
			
		}
		else if ( e.getSource() == Bsalir)
		{
			System.exit(0);
		}
	}
	public static void main (String parametro[]) {
		Ejemplo_04_a ventana = new Ejemplo_04_a ();
		ventana.setVisible(true);
	}

}
